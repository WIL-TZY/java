package br.com.nael.javaweb;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Application {

    public static void main(String[] args) throws LifecycleException {
    	Tomcat tomcat = new Tomcat();
    	tomcat.setPort(8888);
    	tomcat.getConnector(); // precisa pra funcionar
        
    	Context ctx = tomcat.addContext("", new File(".").getAbsolutePath());
    	// Argumentos são: context, string, service
    	Tomcat.addServlet(ctx, "Hello Servlet", new HelloServlet());
    	ctx.addServletMappingDecoded("/hello", "HelloServlet");
    	
    	Tomcat.addServlet(ctx, "InfoServlet", new InfoServlet());
    	ctx.addServletMappingDecoded("/info", "InfoServlet");
    	
    	tomcat.start();
    	tomcat.getServer().await();
    }
}
