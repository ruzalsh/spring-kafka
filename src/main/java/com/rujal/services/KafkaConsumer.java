package com.rujal.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.rujal.model.MessageBuffer;

@Component
public class KafkaConsumer {

	private static final Logger log= LoggerFactory.getLogger(KafkaConsumer.class);
	
	@Autowired
	MessageBuffer msgBuffer;
	
	@KafkaListener(topics="tests")
	public void processMessage(String msg) {
		log.info("received->"+msg);
		msgBuffer.put(msg);
	}
}
