

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/viewAll")
public class ViewAll extends HttpServlet {
	
	public static TreeMap<String,String> contact = new TreeMap<>();
	
	public static String key=" ";
	public static String value=" ";
	public static int count=0;
	
	   public static void data() {
  		 
		  
  	  if(contact.containsKey(key)&&(contact.containsValue(value))) {
			 
			 contact.remove(key, value);
		 }else if(count>=1){
			 
			 contact.clear();
		 }else 
		 {
			    contact.put("9823124090", "Arav");
				contact.put("8122909340", "Kalai");
		  	    contact.put("7358682689","Janani");
		   	    contact.put("9444722270", "Nagarajan");
		  	    contact.put("9054678321", "Deepiha");
		  	   
		 }
	}
	   public static void getCount(int num) {
		   
		   count=num;
	   }
	public static void getNumber(String number) {
		
		      key=number;
	}
	public static void getName(String name) {
		
	      value=name;
}

	public static void Post(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		  try {
				request.getRequestDispatcher("main.html").include(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			}
	      
			  for (Map.Entry map: contact.entrySet()) {
					out.print(map.getValue());
			        out.print("<br>");
			        out.print(map.getKey()); 
			        out.print("<br>");
			        out.print("<br>");
		  }
	   	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		Post(request,response);
		data();
		//displayAll();
		//delete();
		
	}
	}
