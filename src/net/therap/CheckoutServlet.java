package net.therap;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		HttpSession session = req.getSession();
		
		
		List<String> products = (List<String>)session.getAttribute("addedProducts");
		
		
		response.getWriter().write(
				  "<!DOCTYPE html>"
				+ "<html>"
				+ "<body>"	
			);
		response.getWriter().write(
				"<h1>These are your selected products</h1>"
			);
		
		if (products != null) {
			
			for (String id : products) {
				response.getWriter().write(
						 "Product " + id
						+"<br/>"
					);
			}
		}
		
		
		response.getWriter().write(
				  "<form action='/ecomerce/checkout' method='post'>"
				+ "<input type='submit' value='Clear Cart'/>"
				+ "</form>"
			);
		
		response.getWriter().write(
				  "</body>"
				+ "</html>"
			);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		req.getSession().setAttribute("addedProducts", null);
		
	}
}
