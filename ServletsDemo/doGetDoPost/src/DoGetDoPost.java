import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DoGetDoPost extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITEL>The GET Method</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("The servlet has received a GET. Now click the button below");
		out.println("<br>");
		out.println();
		
		out.println("<FORM METHOD=POST>");
		out.println("<INPUT TYPE=SUBMIT VALUE=Submit>");
		out.println("</FORM>");
		out.println("</BODY>");
		out.println("</HTML>");
	}
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>The POST Method</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("The servlet has received a POST");
			out.println("</body>");
			out.println("</html>");
    	}	
}	