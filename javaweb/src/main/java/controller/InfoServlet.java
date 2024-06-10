package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {
			String html = String.format(
					"""
					<html>
						<head>
							<title>Server Info</title>
						</head>
						<body>
							<h1>Servlet Container:</h1>
							<p>Server Info: %s</p>
						</body>
					</html>
					""", getServletContext().getServerInfo());
			
			out.println(html);
		}
	}
}
