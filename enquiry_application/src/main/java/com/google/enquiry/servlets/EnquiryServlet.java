package com.google.enquiry.servlets;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/enquiry")
public class EnquiryServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		EnquiryDto enquiry=new EnquiryDto();
		enquiry.setYourName(req.getParameter("yourName"));
		enquiry.setContactNumber(Long.parseLong(req.getParameter("contactNumber")));
		enquiry.setEmailAddress(req.getParameter("emailAddress"));
		enquiry.setDescription(req.getParameter("description"));
		
		String name=enquiry.getYourName();
		Long number=enquiry.getContactNumber();
		String email=enquiry.getEmailAddress();
		String desc=enquiry.getDescription();
		
		System.out.println("Name:"+name+" "+"Contact Name:"+number+" "+"Email Address:"+email+" "+
		"Description:"+desc);
		
		req.setAttribute("name", name);
		req.setAttribute("cNumber", number);
		req.setAttribute("emailAdrress", email);
		req.setAttribute("descrip", desc);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(req, res);
		
		EnquiryFile enquiryFile=new EnquiryFile();
		enquiryFile.writeFile(enquiry);
		//File f=new File("Enquiry.txt");
		
	}

}
