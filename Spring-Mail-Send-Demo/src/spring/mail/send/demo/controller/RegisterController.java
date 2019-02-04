package spring.mail.send.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mail.send.demo.model.Register;
import spring.mail.send.demo.service.MailService;


@Controller
public class RegisterController 
{
	
	@Autowired
	private MailService mailService;
	

	@RequestMapping("/")
	public String showRegisterForm(@ModelAttribute("register") Register register, Model model) 
	{
		
		model.addAttribute("register", register);
		
		return "register-form";
	}
	
	
	@RequestMapping("/register")
	public String sendData(@ModelAttribute("register") Register register, Model model)
	{
		
		try 
		{
			
			String content = "Name :" +register.getName();
			
			content += "\n Phone: " +register.getPhone();
			
			content += "\n Phone: " +register.getAddress();
			
			content += "\n " +register.getContent();
			
			mailService.send("kmohsin04@gmail.com", register.getEmail(), register.getSubject(), content);
			
			model.addAttribute("message", "Your e-mail has been sent successfully..!!");
			
		} 
		
		catch (Exception e) 
		{
			model.addAttribute("message", e.getMessage());
		}
		
		return "register-form";
	}

}
