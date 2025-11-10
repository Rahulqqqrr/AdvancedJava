package ai.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		System.out.println("control in servlettwo");
		pw.println("<h1>lets print the attributes </h1>");
		Enumeration<String>cursor =request.getAttributeNames();
		while(cursor.hasMoreElements()==true) {
			String name =(String) cursor.nextElement();
			pw.println(name);
			
		}
		
		
		
		
		
	}

}
