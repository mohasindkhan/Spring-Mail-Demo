package spring.mail.send.demo.service;


import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


@Service()
public class MailServiceImpl implements MailService 
{
	
	@Autowired
	private JavaMailSender javaMailSender;
	

	@Override
	public void send(String fromAddress, String toAddress, String subject, String content) 
	{
		
		try 
		{
			
			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
			
			mimeMessageHelper.setFrom(fromAddress);
			
			mimeMessageHelper.setTo(toAddress);
			
			mimeMessageHelper.setSubject(subject);
			
			mimeMessageHelper.setText(content);
			
			mimeMessageHelper.setSentDate(new Date());
			
			javaMailSender.send(mimeMessage);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
