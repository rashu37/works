package com.google.form.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/search")
public class FormServlet extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service Running");
		String name=req.getParameter("yourName");
		String number=req.getParameter("contactNumber"); 
		String email=req.getParameter("email");
		
		System.out.println("Name:"+name+" "+"Contact number:"+number+" "+"Email:"+email);
		req.setAttribute("name", name);
	    req.setAttribute("cnumber", number);
	    req.setAttribute("email", email);
	    
	    RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(req, res);
	    
		
		
	}
}
