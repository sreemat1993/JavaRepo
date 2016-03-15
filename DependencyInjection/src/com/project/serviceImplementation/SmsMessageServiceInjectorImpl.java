package com.project.serviceImplementation;

import com.program.serviceInterface.MessageServiceInjector;
import com.program.serviceInterface.ServiceConsumer;

public class SmsMessageServiceInjectorImpl implements MessageServiceInjector {

	@Override
	public ServiceConsumer getConsumer() {
		return new ServiceConsumerImpl(new SmsMessageServiceImpl());
	}

}
