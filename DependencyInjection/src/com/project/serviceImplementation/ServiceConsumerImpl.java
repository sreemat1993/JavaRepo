package com.project.serviceImplementation;

import com.program.serviceInterface.MessageService;
import com.program.serviceInterface.ServiceConsumer;

public class ServiceConsumerImpl implements ServiceConsumer {

	private MessageService messageService;

	public ServiceConsumerImpl(MessageService messageService) {
		super();
		this.messageService = messageService;
	}

	@Override
	public void processMessages(String msg, String rec) {
		this.messageService.sendMessage(msg, rec);
	}

}
