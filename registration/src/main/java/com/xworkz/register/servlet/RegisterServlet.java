package com.xworkz.register.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/register", loadOnStartup = 2)
public class RegisterServlet extends GenericServlet {

	public RegisterServlet() {
		System.out.println("Register Servlet");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("service is running");
		String userName = req.getParameter("userName");
		String userEmail = req.getParameter("userEmail");
		Long contactNumber = Long.parseLong(req.getParameter("contactNumber"));
		String password = req.getParameter("password");
		System.out.println("userName:" + userName + " " + "email:" + userEmail + " " + "conatct number:" + contactNumber
				+ " " + "password:" + password);
		req.setAttribute("name", userName);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(req, resp);
	}

}
