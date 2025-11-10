package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class IntilizationParameterApp extends HttpServlet {
	protected static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<centre><h1>IntializationParameter</h1></centre></hr>");
		out.println("<table border='1'>");
		out.println("<tr><th>Parameter Name </th><th>Parameter Value</th></tr>");
		Enumeration<String> ParameterNames = getInitParameterNames();
		while (ParameterNames.hasMoreElements()) {
			out.println("<tr>");
			String ParameterName = (String) ParameterNames.nextElement();
			String value = getInitParameter(ParameterName);
			out.println("<td>" + ParameterName + "</td>"); 
			out.println("<td>" + value + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		
		
		
		
		
		
		
		
		
		
		
	}

}
