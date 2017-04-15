/**
 * 
 */
package com.loinx.java.di.service;

/**
 * @author loinx
 *
 */
public class SMSServiceImpl implements MessageService {

	public void sendMessage(String msg, String rec) {
		System.out.println("SMS sent to " + rec + " with Message=" + msg);
	}

}
