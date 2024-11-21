package com.google.blood.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.blood.dto.BloodManagementDto;
import com.google.blood.repository.BloodManagementRepo;
import com.google.blood.repository.BloodRepoImplimentation;
import com.google.blood.service.BloodService;
import com.google.blood.service.BloodServiceImplimentation;

@WebServlet(urlPatterns = "/save")
public class ReadServlets extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// logic
		// invoke the service method

		BloodManagementRepo repo = new BloodRepoImplimentation();
		BloodService service = new BloodServiceImplimentation(repo);

		List<BloodManagementDto> list = service.read();

		request.setAttribute("listDto", list);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("view.jsp");
		requestDispatcher.forward(request, response);

	}

}
