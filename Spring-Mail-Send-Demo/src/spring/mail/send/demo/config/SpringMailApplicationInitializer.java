package spring.mail.send.demo.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class SpringMailApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		return new Class[] { SpringMailDemo.class };
	}

	@Override
	protected String[] getServletMappings() 
	{
		return new String[] { "/" };
	}

}
