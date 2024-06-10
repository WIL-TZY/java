package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
A anotação @WebServlet é usada em classes 
que estendem HttpServlet para configurar uma servlet 
diretamente na classe, sem a necessidade de definir a 
servlet no arquivo web.xml.
*/

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		Path filePath = Paths.get(getServletContext().getRealPath("/hello.html"));
		
		if (Files.exists(filePath)) {
			response.getWriter().write(Files.readString(filePath));
		}
		else {
			response.getWriter().write("<h1>Arquivo não encontrado</h1>");
			}
		
		/*
		response.getWriter().write("<h1>Olá, mundo!</h1>");
		response.getWriter().flush();
		response.getWriter().close();
		*/
	}
}