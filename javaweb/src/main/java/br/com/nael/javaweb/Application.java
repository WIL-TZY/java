package br.com.nael.javaweb;

import controller.HelloServlet;
import controller.InfoServlet;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;


/*
Buildar com o Maven:
	mvn clean
	mvn package
Roda o programa:
	java -jar target/javaweb-0.0.1-jar-with-dependencies.jar
*/
public class Application {

    public static void main(String[] args) throws LifecycleException {
    	Tomcat tomcat = new Tomcat();
    	tomcat.setPort(8888);
    	tomcat.getConnector(); // precisa pra funcionar
        
    	// Fazendo com o Tomcat (Webapp)
    	/*
    	Context ctx = tomcat.addContext("", new File(".").getAbsolutePath());
    	// Argumentos são: context, string, service
    	Tomcat.addServlet(ctx, "HelloServlet", new HelloServlet());
    	ctx.addServletMappingDecoded("/hello", "HelloServlet");
    	
    	Tomcat.addServlet(ctx, "InfoServlet", new InfoServlet());
    	ctx.addServletMappingDecoded("/info", "InfoServlet");
    	*/
    	
    	// Fazendo sem o Tomcat (Webapp)
    	Context ctx = tomcat.addWebapp("/", new File("src/main/webapp/").getAbsolutePath());
    	
    	var novoDirClasses = new File("target/classes").getAbsolutePath();
    	WebResourceRoot resources = new StandardRoot(ctx);
    	var dirBaseClasses = new DirResourceSet(resources, "/WEB-INF/classes", novoDirClasses, "/");
    	resources.addPreResources(dirBaseClasses);
    	ctx.setResources(resources);
    	
    	tomcat.start();
    	tomcat.getServer().await();
    }
}
