package com.google.enquiry.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/enquiry")
public class ReadServlet extends HttpServlet{
	
	@Override
	public void init(){
        System.out.println("servlet initialized");
	}
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get method is running");
		EnquiryDto enquiry = new EnquiryDto();
		enquiry.setYourName(req.getParameter("yourName"));
		enquiry.setContactNumber(Long.parseLong(req.getParameter("contactNumber")));
		enquiry.setEmailAddress(req.getParameter("emailAddress"));
		enquiry.setDescription(req.getParameter("description"));
		
		
	    RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
	    req.setAttribute("dto", enquiry);
	    dispatcher.forward(req, response);
	   
	}
	
	
	@Override
	public void destroy() {
	   System.out.println("destory method is running");
	}

}
