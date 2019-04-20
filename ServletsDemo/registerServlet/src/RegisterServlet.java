
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Enumeration<?> enumeration = request.getHeaderNames();
		while (enumeration.hasMoreElements()) {
			String header = (String)enumeration.nextElement();
			out.println(header + " :" + request.getHeader(header) + "<BR>");
		}
		out.println("get PathInfo: " + request.getPathInfo() + "<br>");
		out.println("getPathTranslated: " + request.getPathTranslated() + "<br>");
		out.println("getRequestURI(): " + request.getRequestURI() + "<BR>");
		out.println("getServletPath(): " + request.getServletPath() + "<BR>");
	}

}
