package com.emailadv.services.impl;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.emailadv.services.EmailService;

public class EmailServiceImpl implements EmailService{

	private JavaMailSender mailSender;
	private Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);

	public EmailServiceImpl(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	@Override
	public void sendEmail(String to, String subject, String message) {
		// TODO Auto-generated method stub
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(message);
		simpleMailMessage.setFrom("cybermonk24@gmail.com");
		mailSender.send(simpleMailMessage);
		logger.info("Email has been sent..");
	}

	@Override
	public void sendEmail(String[] to, String from, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendEmailWithHtml(String to, String from, String htmlContent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendEmailWithFile(String to, String from, String message, File file) {
		// TODO Auto-generated method stub
		
	}

	

}
