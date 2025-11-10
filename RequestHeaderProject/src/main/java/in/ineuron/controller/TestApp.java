package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestApp")
public class TestApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		LocalDateTime date = LocalDateTime.now();
		int hour = date.getHour();
		String msg = "";
		if(hour <12) {
			msg+="GoodMorning";
		}else if(hour<16) {
			msg+="GoodAfterNoon";
		}else if(hour<20) {
			msg+="Good Evning";
		}else {
			msg+="Good Night";
		}
		out.println("<h1 style ='color:red;text-alignment:centre;'>Welcome to servlet.....</h1>");
		out.println("<h1 style ='color:red;text-alignment:centre;'>The curent date time is ::"+date +"</h1>");
		out.println("<h1>Greeting From the Server::"+msg+"</h1>");
		
		
		
		out.println("<br/>Servlet Request object is::"+request.hashCode());
		out.println("<br/>Servlet Tesponse  object is::"+response.hashCode());
		out.println("<br/> Current Servlet Request object is::"+this.hashCode());
		out.println("<br/>Current  Thread object is::"+Thread.currentThread().hashCode());
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	
		out.close();
		
		
		
	}

}
