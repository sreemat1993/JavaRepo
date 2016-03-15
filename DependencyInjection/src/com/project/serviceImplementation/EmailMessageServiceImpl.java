package com.project.serviceImplementation;

import com.program.serviceInterface.MessageService;

public class EmailMessageServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		System.out.println("Sending Email to : "+rec);
		System.out.println("Message : "+msg);

	}

}
