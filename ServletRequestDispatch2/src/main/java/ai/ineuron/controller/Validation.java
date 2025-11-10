package ai.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Valid")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("You are in Validation Servlet");
		String Username= request.getParameter("username");
		String Userpassword = request.getParameter("userpassword");
		System.out.println(Username+ " " + Userpassword);
		
		if(Username.contentEquals("RahulSaini") && Userpassword.contentEquals("java")) {
			RequestDispatcher req =request.getRequestDispatcher("/home.jsp");
			req.forward(request, response);
		}else{
			ServletContext context = request.getServletContext();
			RequestDispatcher req =context.getRequestDispatcher("/errorjsp.jsp");
		    req.forward(request, response);
			
		}
		
		
		
	}

}
