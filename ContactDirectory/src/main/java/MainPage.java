import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mainpage")
public class MainPage extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/html");

    PrintWriter out = response.getWriter();
	  
	try {
		request.getRequestDispatcher("main.html").include(request, response);
	} catch (ServletException e) {
		e.printStackTrace();
	}
     HttpSession session=request.getSession();  
     Date createTime = new Date(session.getCreationTime());
     
     Date lastAccessTime = new Date(session.getLastAccessedTime());
     
     String name = request.getParameter("name");
     session.setAttribute(name,"name");
     String number = request.getParameter("number");
     session.setAttribute(number, "number");
     
     out.println("User Name:=> "+name+"<br>");
     out.println("\n\r  Mobile number:=> "+number+"<br>");
     out.println("\n\r  Time of creation:=> " + createTime+"<br>");
     out.println("\n\r  Last access time:=> "+lastAccessTime+"<br>");
   	 
	  
  }
}