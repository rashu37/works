package com.google.passport.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/register")
public class PassportServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service Running");
		String name=req.getParameter("yourName");
		String number=req.getParameter("contactNumber"); 
		String email=req.getParameter("emailAddress"); 
		String fatherName=req.getParameter("yourFatherName"); 
		String motherName=req.getParameter("yourMotherName"); 
		String currentAddress=req.getParameter("currentAddress"); 
		String permanentAddress=req.getParameter("permanentAddress"); 
		String qualification=req.getParameter("highestQualification");
		String adharNumber=req.getParameter("adharNumber");
		
	    System.out.println("Name:"+name+" "+"Contact Number:"+number+" "+"Email Address:"+email+" "+
		"Father Name:"+fatherName+" "+"Mother Name:"+motherName+" "+"Current Address:"+currentAddress+
		" "+"Permanent Address:"+permanentAddress+" "+ "Highest Qualification:"+qualification+" "+
		"Adhar Number:"+ adharNumber);
	    
	    req.setAttribute("name", name);
	    req.setAttribute("cnumber", number);
	    req.setAttribute("email", email);
	    req.setAttribute("father", fatherName);
	    req.setAttribute("mother", motherName);
	    req.setAttribute("caddress", currentAddress);
	    req.setAttribute("paddress", permanentAddress);
	    req.setAttribute("hQ", qualification);
	    req.setAttribute("aadharno", adharNumber);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(req, res);
		
	}

}
