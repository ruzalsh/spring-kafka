package com.rujal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rujal.services.KafkaProducer;

@RestController
public class ProducerController {

	@Autowired
	KafkaProducer producer;
	
	@GetMapping(value="/send")
	public ResponseEntity<?> send(){
		producer.send("Hi i am rujal Shrestha");
		return new ResponseEntity<Object>("message sent.",HttpStatus.OK);
	}
}
