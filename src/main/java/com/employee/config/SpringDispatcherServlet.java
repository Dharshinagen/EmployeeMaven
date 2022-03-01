package com.employee.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

 import com.employee.config.*;

 

public class SpringDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
 

	 
	 @Override
	    protected String[] getServletMappings() {
	        return new String[] {
	            "/"
	        };
	    }

	@Override
	protected Class<?>[] getRootConfigClasses() {
		 
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 
		   return new Class[] {
	            MvcConfig.class
	        };
	}


	 
}
