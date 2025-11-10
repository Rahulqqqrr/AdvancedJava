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
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in servletOne");
		request.setAttribute("Hyder", "java");
		request.setAttribute("navin", "c++");
		request.setAttribute("nitin", "python");
		RequestDispatcher req = request.getRequestDispatcher("/ServletTwo");
		req.forward(request,response);
		System.out.println("Dispatch is Success");
		
		
		
		
		
		
		
	}

}
