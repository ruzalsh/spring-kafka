package com.rujal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	@Autowired
	KafkaTemplate<String, Object> kafkaTemplate;
	
	public void send(String message) {
		kafkaTemplate.send("tests",message);
	}
}
