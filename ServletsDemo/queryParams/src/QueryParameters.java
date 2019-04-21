

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class QueryParameters extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Get query parameters.</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("The request's parameters are: <br>");
		
		Enumeration<String> enumeration = request.getParameterNames();
		while (enumeration.hasMoreElements()) {
			String parameterName = (String)enumeration.nextElement();
			out.println(parameterName + ": " + request.getParameter(parameterName) + "<br>");
		}
		
		out.println("<form method=GET>");
		out.println("<br>Firs name: <input type=txt name=firstName>");
		out.println("<br>Last name: <input type=txt name=lastName>");
		out.println("<br><input type=submit value=Submit>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
