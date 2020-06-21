package com.wipro.mvc; //This class is to repalce web.xml

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyFrontController extends 
AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {MyMvcConfiguration.class} ;
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
