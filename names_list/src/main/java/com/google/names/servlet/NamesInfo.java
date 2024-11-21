package com.google.names.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/names")
public class NamesInfo extends HttpServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("service is running");
	
		List<String> names =new ArrayList<String>();
		names.add("Rohini");
		names.add("Shreenidhi");
		names.add("Laxmi");
		names.add("Soumya");
		names.add("Seema");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
	    req.setAttribute("list", names);
	    dispatcher.forward(req, resp);
		}
}
