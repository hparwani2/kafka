package com.example.demo.service;


import com.example.demo.controller.HomeController;
import com.example.demo.response.CSEDetailsResponse;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class kafkaListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);


    @KafkaListener(topics = "resource_inventory"
            , groupId = "group_id"
            , containerFactory = "kafkaListenerContainerFactory")
    public void onMessage(ConsumerRecord<String, CSEDetailsResponse> consumerRecord
            , Acknowledgment acknowledgment) {
        LOGGER.info(consumerRecord.key() + "  " + consumerRecord.value() + " " + consumerRecord.partition());
        acknowledgment.acknowledge();
    }

}
