package alqallaf.com.kw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/ServletSession" })
public class SimpleServletSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (userName != "" && userName != null )
			{
				session.setAttribute("saveUserName", userName);
				context.setAttribute("saveUserName", userName);
			}
		writer.println("<h3>Request parameter has user name as  </h3>" + userName );
		writer.println("<h3>Session parameter has user name as  </h3>" + (String) session.getAttribute("saveUserName"));
		writer.println("<h3>Context parameter has user name as  </h3>" + (String) context.getAttribute("saveUserName"));
	}

}
