package com.google.movie.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/movie")
public class MovieBooking extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Movie Booking Page");
		PrintWriter writer =res.getWriter();
	    res.setContentType("text/html"); 
	    writer.println("Movie Booking Done"+"<br>"+"<br>");
	    writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>"+"Web page"+"</title>");
		writer.println("</head>");
		writer.println("<body>");
		
		writer.println("Movie Name is:"+req.getParameter("Movie Name")+"<br>");
		writer.println("Movie Hero:"+req.getParameter("Movie Hero")+"<br>");
		writer.println("Movie Heroine:"+req.getParameter("Movie Heroine")+"<br>");
		writer.println("Movie Langauge:"+req.getParameter("Movie Language"));
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	    
	}

}
