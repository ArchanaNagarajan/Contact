

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		  
		PrintWriter out = response.getWriter();
			
			try{
				request.getRequestDispatcher("main.html").include(request, response);
			}catch(ServletException e){
				e.printStackTrace();
			}
			
			 String name = request.getParameter("name");
		    
		     String number = request.getParameter("number");
		    
		     out.print(name+"<br>");
		     out.print(number+"<br>");
		     
		     ViewAll.contact.put(name, number);
			response.sendRedirect("viewAll");
		}
		    // ViewAll.contact.put(name, number);
			//request.setAttribute(name, number);
	         

}