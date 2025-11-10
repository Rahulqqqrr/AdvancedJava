package ai.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		System.out.println("control in servlet1");
		pw.println("<h1>Servlet1 response </h1>");
		RequestDispatcher req = request.getRequestDispatcher("/servlet2");
		req.include(request,response);
		System.out.println("Dispatch is Success");
		pw.println("<h1>Servlet1 response again</h1>");
		
		
		
		
	}

}
