package com.example.demo.service;


import com.example.demo.response.CSEDetailsResponse;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class kafkaListener {


    @KafkaListener(topics = "resource_inventory" , groupId = "group_id" , containerFactory = "kafkaListenerContainerFactory")
    public void onMessage(ConsumerRecord<String, CSEDetailsResponse> consumerRecord
            , Acknowledgment acknowledgment) {
        System.out.println(consumerRecord.key() + "  " + consumerRecord.value() + " " + consumerRecord.partition());
        acknowledgment.acknowledge();
    }

}
