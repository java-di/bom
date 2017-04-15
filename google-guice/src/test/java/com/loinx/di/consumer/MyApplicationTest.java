/**
 * 
 */
package com.loinx.di.consumer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.loinx.java.di.consumer.MyApplication;
import com.loinx.java.di.services.MessageService;

/**
 * @author loinx
 *
 */
public class MyApplicationTest {
	private Injector injector;

	@Before
	public void setup() {
		injector = Guice.createInjector(new AbstractModule() {

			@Override
			protected void configure() {
				bind(MessageService.class).to(MockMessageService.class);
			}
		});
	}

	@After
	public void tearDown() throws Exception {
		injector = null;
	}

	@Test
	public void shouldSendMessageSuccessfully() {
		MyApplication application = injector.getInstance(MyApplication.class);
		Assert.assertEquals(true, application.sendMessage("Hi Pankaj", "pankaj@abc.com"));
	}

	static class  MockMessageService implements MessageService {

		@Override
		public boolean sendMessage(String msg, String receipient) {
			System.err.println("For testing purpose.");
			return true;
		}

	}
}
