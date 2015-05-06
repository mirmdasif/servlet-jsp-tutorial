package net.therap;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/error")
public class ErrorServlet extends GenericServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		arg1.getWriter().println("<h1>An Error Has Occoured</h1>");
	}
	
	
}
