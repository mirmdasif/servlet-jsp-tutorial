package net.therap;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowProductServlet
 */
@WebServlet("/showProducts")
public class ShowProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		
		
		response.getWriter().write(
					  "<!DOCTYPE html>"
					+ "<html>"
					+ "<body>"	
				);
		response.getWriter().write(
					"<h1>These are our amaging products</h1>"
				);
		
		if(id == null || id.equals("1")) {

			response.getWriter().write(
						  "<div>"
						+ " <h2>Product 1</h2>"
						+ " <h3>Price 100$</h3>"
						+ "</div>"
						+ "<div>"
					);
		}
		
		if(id == null || id.equals("2")) {

			response.getWriter().write(
						  " <h2>Product 2</h2>"
						+ " <h3>Price 50$</h3>"
						+ "</div>"
					);
		}
		
		if(id == null || id.equals("3")) {

			response.getWriter().write(
						  "<div>"
						+ " <h2>Product 3</h2>"
						+ " <h3>Price 150$</h3>"
						+ "</div>"
					);
		}
		response.getWriter().write(
					  "</body>"
					+ "</html>"
				);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
