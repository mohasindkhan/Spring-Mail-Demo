package spring.mail.send.demo.service;


public interface MailService 
{
	
	public void send(String fromAddress, String toAddress, String subject, String content);

}
