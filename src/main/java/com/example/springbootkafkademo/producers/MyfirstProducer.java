package com.example.springbootkafkademo.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//import org.springframework.kafka.core.kafkaTemplate;
@Service
public class MyfirstProducer {
    @Value("${krishna.kafka.topic.name}")
    private String topicName;

    @Autowired
    KafkaTemplate kafkaTemplate;

public void sendMessage(String message){

    kafkaTemplate.send(topicName,message);


}

}
