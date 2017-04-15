/**
 * 
 */
package com.loinx.java.di.legacy;

import com.loinx.java.di.consumer.Consumer;
import com.loinx.java.di.injector.EmailServiceInjector;
import com.loinx.java.di.injector.MessageServiceInjector;
import com.loinx.java.di.injector.SMSServiceInjector;

/**
 * @author loinx
 *
 */
public class MyLegacyTest {
	public static void main(String[] args) {
		String msg = "Hi Pankaj";
		String email = "pankaj@abc.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;
		Consumer app = null;

		// Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);

		// Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}
}
