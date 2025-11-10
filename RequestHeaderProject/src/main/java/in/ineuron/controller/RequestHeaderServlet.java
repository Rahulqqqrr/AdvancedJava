package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class RequestHeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		PrintWriter out = response.getWriter();
//		out.println("<body>");
//		out.println("<centre>");
//		out.println("<h1 style ='color:red;text-align:centre;'>REQUEST HEADER INFO....</h1>");
//		out.println("<table border=''>");
//		out.println("<tr><th>Header name </th><th>Header value</th></tr>");
//		Enumeration<String> headernames = request.getHeaderNames();
//		while(headernames.hasMoreElements()) {
//			out.println("<tr>");
//			String headerName = (String)headernames.nextElement();
//			String value = request.getHeader(headerName);
//			out.println("<td>"+headerName+"</td");
//			out.println("<td>"+ value +"</td");
//			out.println("</tr>");
//			
//		}
//		out.println("</table>");
//		
//		out.println("</centre>");
//		out.println("</body>");
//		out.close();
		PrintWriter out = response.getWriter();
		out.println("<body>");
		out.println("<center>");
		out.println("<h1 style='color:red; text-align:center;'>REQUEST HEADER INFORMATION...</h1>");
		out.println("<table border='2'>");
		out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");

		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			out.println("<tr>");
			String headerName = (String) headerNames.nextElement();
			String value = request.getHeader(headerName);
			out.println("<td>" + headerName + "</td>");
			out.println("<td>" + value + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.close();
		
		
		
	}

}
