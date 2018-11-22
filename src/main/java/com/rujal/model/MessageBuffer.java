package com.rujal.model;

import java.util.LinkedHashSet;

import org.springframework.stereotype.Component;

@Component
public class MessageBuffer {

	private LinkedHashSet<String> msg = new LinkedHashSet<String>();
	
	public void put(String message) {
		msg.add(message);
	}
	
	public void clear() {
		msg.clear();
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
		msg.forEach(m->buff.append(m).append("\n"));
		return buff.toString();
	}
}
