/**
 * 
 */
package com.loinx.java.di.injector;

import com.google.inject.AbstractModule;
import com.loinx.java.di.services.EmailService;
import com.loinx.java.di.services.FacebookService;
import com.loinx.java.di.services.MessageService;

/**
 * @author LoiNX
 *
 */
public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		// bind the service to implementation class
		 bind(MessageService.class).to(EmailService.class);

		// bind MessageService to Facebook Message implementation
//		bind(MessageService.class).to(FacebookService.class);
	}

}
