package com.emailadv;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.emailadv.services.EmailService;

@SpringBootTest
public class EmailSenderTest {
	private EmailService emailService;
	@Test
	void emailSendTest() {
		System.out.println("sending email");
		emailService.sendEmail("akshayvdeshmukh1@gmail.com", "Test Mail", "Hello from spring boot..");
	}
}
