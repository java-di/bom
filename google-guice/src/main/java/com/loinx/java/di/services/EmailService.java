/**
 * 
 */
package com.loinx.java.di.services;

import javax.inject.Singleton;

//  OR
//import com.google.inject.Singleton;

/**
 * @author loinx
 *
 */
@Singleton
public class EmailService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String receipient) {
		System.out.println("Message sent to Email user " + receipient + " with message=" + msg);
		return true;
	}

}
