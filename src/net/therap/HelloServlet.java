package net.therap;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().write(
				  "<!DOCTYPE html>"
				+ "<html>"
				+ "<body>"	
			);
		response.getWriter().write(
				"<h1>Welcome User</h1>"	
			);
		response.getWriter().write(
				  "</body>"
				+ "</html>"
			);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		response.getWriter().write(
				  "<!DOCTYPE html>"
				+ "<html>"
				+ "<body>"	
			);
		response.getWriter().write(
				"<h1>Welcome " + firstName + " " + lastName+ "</h1>"	
			);
		response.getWriter().write(
				  "</body>"
				+ "</html>"
			);
	}
			
		
	

}
