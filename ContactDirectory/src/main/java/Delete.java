

import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
//public static TreeMap<String,String> contact = new TreeMap<>();
	public static  String cName;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  
				PrintWriter out = response.getWriter();
					
					try{
						request.getRequestDispatcher("main.html").include(request, response);
					}catch(ServletException e){
						e.printStackTrace();
					}
					
				 String name = request.getParameter("name");
				 String number=request.getParameter("number");
				 
				 ViewAll.getNumber(number);
				 ViewAll.getName(name);
				 response.sendRedirect("viewAll");
				  
	}

}
