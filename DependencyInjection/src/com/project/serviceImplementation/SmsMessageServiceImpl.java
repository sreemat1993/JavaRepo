package com.project.serviceImplementation;

import com.program.serviceInterface.MessageService;

public class SmsMessageServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		System.out.println("Sending SMS to : "+rec);
		System.out.println("Message : "+msg);


	}

}
