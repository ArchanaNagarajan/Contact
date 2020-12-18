

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DeleteAll
 */
@WebServlet("/DeleteAll")
public class DeleteAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			request.getRequestDispatcher("main.html").include(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
		
		 HttpSession session=request.getSession();  
         
	       Integer visitCount = new Integer(0);
	       
	      if (session.isNew()) {
	         visitCount=1;
	      } else {
	         
	         visitCount = visitCount + 1;
	      }
  		    ViewAll.getCount(visitCount);
	}

}
