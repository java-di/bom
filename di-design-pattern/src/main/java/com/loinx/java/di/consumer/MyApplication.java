/**
 * 
 */
package com.loinx.java.di.consumer;

import com.loinx.java.di.service.MessageService;

/**
 * @author loinx
 *
 */
public class MyApplication implements Consumer{
	private MessageService service;

	public MyApplication(MessageService service) {
		this.service = service;
	}

	public void processMessages(String msg, String rec) {
		this.service.sendMessage(msg, rec);
	}
}
