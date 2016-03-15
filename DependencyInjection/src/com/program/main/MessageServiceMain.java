package com.program.main;

import com.program.serviceInterface.MessageServiceInjector;
import com.program.serviceInterface.ServiceConsumer;
import com.project.serviceImplementation.EmailMessageServiceInjectorImpl;
import com.project.serviceImplementation.ServiceConsumerImpl;
import com.project.serviceImplementation.SmsMessageServiceInjectorImpl;

public class MessageServiceMain {

	public static void main(String[] args) {
		String message = "Success";
		String phone = "8870374405";
		String to = "sreemat";
		MessageServiceInjector injector = null;
		ServiceConsumer consumerImpl = null;

		injector = new EmailMessageServiceInjectorImpl();
		consumerImpl = injector.getConsumer();
		consumerImpl.processMessages(message, to);

		injector = new SmsMessageServiceInjectorImpl();
		consumerImpl = injector.getConsumer();
		consumerImpl.processMessages(message, phone);
	}
}
