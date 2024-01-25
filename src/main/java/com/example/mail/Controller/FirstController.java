package com.example.mail.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mail.Model.Emails;
@RestController
public class FirstController {

	@Autowired //use for dependency adding
	private JavaMailSender javaMailSender;
	
	@PostMapping("/send")
	public String sendEmail(@RequestBody Emails emailRequest)
	{
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("gawadeutkarsha01@gmail.com");
		message.setTo(emailRequest.getTo());
		message.setSubject(emailRequest.getSubject());
		message.setText(emailRequest.getBody());
		
		javaMailSender.send(message);
		
		return "Email sent successfully";
	}
	
}
