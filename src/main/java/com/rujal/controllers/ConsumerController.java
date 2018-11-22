package com.rujal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rujal.model.MessageBuffer;

@RestController
public class ConsumerController {
	
	@Autowired
	MessageBuffer msgBuffer;

	@GetMapping(value = "/receive")
	public ResponseEntity<?> receiver(String message){
		String msg =msgBuffer.toString();
		msgBuffer.clear();
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
