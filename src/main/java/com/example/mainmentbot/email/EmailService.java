package com.example.mainmentbot.email;





import org.slf4j.LoggerFactory;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.*;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;




import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmailService implements EmailSender{

	
	private JavaMailSender mailsender;
	
	private final static Logger LOGGER=LoggerFactory.getLogger(EmailService.class);
	
	@Override
	@Async
	public void send(String to, String email) {
		try {
			MimeMessage mimeMessage=mailsender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,"utf-8");
			helper.setText(email,true);
			helper.setTo(to);
			helper.setSubject("Confirm your email");
			helper.setFrom("");
			
		}
		catch(MessagingException e) {
			
			LOGGER.error("Failed to send email",e);	
			throw new IllegalStateException("failed to send email");
			
		
		}
		
	}
	


}
