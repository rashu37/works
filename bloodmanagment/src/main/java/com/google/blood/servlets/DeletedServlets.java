package com.google.blood.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.blood.repository.BloodManagementRepo;
import com.google.blood.repository.BloodRepoImplimentation;
import com.google.blood.service.BloodService;
import com.google.blood.service.BloodServiceImplimentation;
@WebServlet(urlPatterns = "/delete")
public class DeletedServlets extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		//parsing wrapper class
		BloodManagementRepo repo=new BloodRepoImplimentation();
		BloodService service=new BloodServiceImplimentation(repo);
		
		String result=service.delete(id);
		
		req.setAttribute("deleted", result);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("view.jsp");
		requestDispatcher.forward(req, resp);
	}

}
