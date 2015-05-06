package net.therap;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowProductServlet
 */
@WebServlet(urlPatterns = {"/showProducts", "/addProduct"})
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
		response.getWriter().write("<form method='post' action='/ecomerce/addProduct'>");
		if(id == null || id.equals("1")) {

			response.getWriter().write(
						  "<div>"
						+ " <h2>Product 1</h2>"
						+ " <h3>Price 100$</h3>"
						+ "<input type='hidden' name='id' value='1'/>"
						+ "<input type='submit' value='Add to Cart'/>"
						+ "</div>"
					);
		}
		
		if(id == null || id.equals("2")) {

			response.getWriter().write(
			
						  "<div>"
						+ "<h2>Product 2</h2>"
						+ "<h3>Price 50$</h3>"
						+ "<input type='hidden' name='id' value='2'/>"
						+ "<input type='submit' value='Add to Cart'/>"
						+ "</div>"
					);
		}
		
		if(id == null || id.equals("3")) {

			response.getWriter().write(
						  "<div>"
						+ " <h2>Product 3</h2>"
						+ " <h3>Price 150$</h3>"
						+ "<input type='hidden' name='id' value='3'/>"
						+ "<input type='submit' value='Add to Cart'/>"
						+ "</div>"
					);
		}
		response.getWriter().write("</form>");
		response.getWriter().write(
					  "</body>"
					+ "</html>"
				);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		ArrayList<String> addedProducts = (ArrayList<String>)session.getAttribute("addedProducts");
		
		if(addedProducts == null) {
			addedProducts = new ArrayList<String>();
		}
		
		String id = request.getParameter("id");
		if (id != null) {
			addedProducts.add(id);
		}
		
		System.out.println(id);
		
		session.setAttribute("addedProducts", addedProducts);
	}

}
