package com.xworkz.register.servlet;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/test", loadOnStartup = 1)
public class HandleRequest extends HttpServlet {

	public HandleRequest() {
		System.out.println("this is HandleRequest");
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("do get methods");
	}
	
}
