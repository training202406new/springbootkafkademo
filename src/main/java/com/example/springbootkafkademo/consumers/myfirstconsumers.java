package com.example.springbootkafkademo.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class myfirstconsumers {
    Logger log = LoggerFactory.getLogger(myfirstconsumers.class);

    @KafkaListener(topics = "${krishna.kafka.topic.name}")
    public void Listen(String message){
        log.error("Recieved message from kafka is :"+message);
    }
}
