package com.connect2java.RestfulApplicationPathAnnotationExample;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

	@ApplicationPath("resources")
	public class MyApplication extends ResourceConfig {
	    public MyApplication() {
	        packages("com.connect2java.RestfulApplicationPathAnnotationExample");
	    }
	   
	}
	
