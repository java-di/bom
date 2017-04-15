/**
 * 
 */
package com.loinx.java.di.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.loinx.java.di.consumer.MyApplication;
import com.loinx.java.di.injector.AppInjector;

/**
 * @author loinx
 *
 */
public class ClientApplication {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppInjector());

		MyApplication app = injector.getInstance(MyApplication.class);

		app.sendMessage("Hi Pankaj", "pankaj@abc.com");
	}
}
