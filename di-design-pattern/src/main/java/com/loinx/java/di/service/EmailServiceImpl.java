/**
 * 
 */
package com.loinx.java.di.service;

/**
 * @author loinx
 *
 */
public class EmailServiceImpl implements MessageService{

	public void sendMessage(String msg, String rec) {
		System.out.println("Email sent to " + rec + " with Message=" + msg);
	}
}
