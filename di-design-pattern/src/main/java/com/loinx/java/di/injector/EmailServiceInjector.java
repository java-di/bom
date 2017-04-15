/**
 * 
 */
package com.loinx.java.di.injector;

import com.loinx.java.di.consumer.Consumer;
import com.loinx.java.di.consumer.MyApplication;
import com.loinx.java.di.service.EmailServiceImpl;

/**
 * @author loinx
 *
 */
public class EmailServiceInjector implements MessageServiceInjector {

	/* (non-Javadoc)
	 * @see com.loinx.java.di.injector.MessageServiceInjector#getConsumer()
	 */
	public Consumer getConsumer() {
		return new MyApplication(new EmailServiceImpl());
	}

}
