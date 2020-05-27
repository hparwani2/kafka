package com.example.demo.configuration;


import com.example.demo.response.CSEDetailsResponse;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.kafka.*;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConfig {

    public class ConsumerConfig {

        @Value("${consumer.bootstrap.server.address}")
        private String bootstrapServerAddress;

        @Bean
        public Map<String, Object> consumerKafkaConfigs() {
            Map<String, Object> props = new HashMap<>();
            props.put(org.apache.kafka.clients.consumer.ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServerAddress);
            props.put(org.apache.kafka.clients.consumer.ConsumerConfig.GROUP_ID_CONFIG, "group_id");
            props.put(org.apache.kafka.clients.consumer.ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
            props.put(org.apache.kafka.clients.consumer.ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
            props.put(org.apache.kafka.clients.consumer.ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,false);

            return props;
        }

        @Bean
        public ConsumerFactory<String, CSEDetailsResponse> consumerFactory() {
            return new DefaultKafkaConsumerFactory<>(consumerKafkaConfigs(), new StringDeserializer(),
                    new JsonDeserializer<>(CSEDetailsResponse.class));
        }

        @Bean
        public ConcurrentKafkaListenerContainerFactory<String, CSEDetailsResponse> kafkaListenerContainerFactory() {
            ConcurrentKafkaListenerContainerFactory<String, CSEDetailsResponse> factory =
                    new ConcurrentKafkaListenerContainerFactory<>();
            factory.setConsumerFactory(consumerFactory());
            factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.MANUAL_IMMEDIATE);
            return factory;
        }
    }


}
