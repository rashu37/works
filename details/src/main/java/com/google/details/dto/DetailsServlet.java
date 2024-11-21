package com.google.details.dto;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/details")
public class DetailsServlet extends HttpServlet {
	

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		DetailsDto dto= new DetailsDto();
		dto.setName(req.getParameter("yourName"));
		dto.setDob(req.getParameter("dob"));
		dto.setState(req.getParameter("state"));
		dto.setGender(req.getParameter("gender"));
		dto.setLanguages(req.getParameter("languages"));
		
		String names=dto.getName();
		String datebirth=dto.getDob();
		String states=dto.getState();
		String genders=dto.getGender();
		String languages=dto.getLanguages();
		
		System.out.println("Name:"+names+" "+"Dob:"+datebirth+" "+"State:"+states+" "+"Gender:"+genders+" "+
		"Languages:"+languages);
		
		req.setAttribute("name", names);
		req.setAttribute("dob", datebirth);
		req.setAttribute("states", states);
		req.setAttribute("genders", genders);
		req.setAttribute("languages",languages);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(req, res);

	}
}
