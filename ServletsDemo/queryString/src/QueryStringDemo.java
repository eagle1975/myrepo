

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class QueryStringDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Obtaining query string</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Query string: " + request.getQueryString() + "<br>");
		out.println("<form method=GET>");
		out.println("<br>First name: <input type=text name=FirstName>");
		out.println("<br>Last name: <input type=text name=LastName>");
		out.println("<br><input type=submit value=Submit>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	

}
