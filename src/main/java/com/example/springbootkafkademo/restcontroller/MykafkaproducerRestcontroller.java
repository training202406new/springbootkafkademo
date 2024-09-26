package com.example.springbootkafkademo.restcontroller;

import com.example.springbootkafkademo.producers.MyfirstProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MykafkaproducerRestcontroller {

    @Autowired
    MyfirstProducer myfirstProducer;

    @PostMapping("/public/{message}")
    public ResponseEntity publicMessage(@PathVariable("message")String message, @RequestBody String msg){
        String inputmessage=message+msg;
        myfirstProducer.sendMessage(inputmessage);
        return ResponseEntity.ok(inputmessage);
    }

}
