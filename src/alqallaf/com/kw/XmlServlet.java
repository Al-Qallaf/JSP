package alqallaf.com.kw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName"); //pass parameter
		out.println("Hello from doGet method " + userName + " :***");	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName"); //pass parameter
		String FullName = request.getParameter("FullName"); //second parameter passed
		out.println("Hello from doPost method" + userName + " :*** Full Name is: " + FullName);	
		String prof = request.getParameter("prof");
		out.println("You are " + prof);
		//String location = request.getParameter("location"); //single value from select
		String[] location = request.getParameterValues("location");
		out.println("You are " + location.length + " Places");
		for (int i=0;i<location.length;i++)
		{
			out.println(location[i]);
		}
		//same for radio button			
	}
}

