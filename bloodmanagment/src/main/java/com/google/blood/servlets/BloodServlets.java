package com.google.blood.servlets;

import java.io.IOException;

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

@WebServlet(urlPatterns = "/blood")
public class BloodServlets extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("yourName");
		Integer age = Integer.parseInt(req.getParameter("yourAge"));
		String group = req.getParameter("bloodGroup");
		System.out.println("Name:" + name + " " + "Age:" + age + " " + "Blood Group:" + group);

		BloodManagementDto dto = new BloodManagementDto();
		dto.setName(name);
		dto.setAge(age);
		dto.setGroup(group);

		BloodManagementRepo repo = new BloodRepoImplimentation();
		BloodService service = new BloodServiceImplimentation(repo);
		System.out.println(service.onSave(dto));

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(req, res);

		System.out.println(service.read());
		System.out.println("Delete Method");
		System.out.println(service.delete(11));
		System.out.println("Delete Method Done");

		System.out.println(service.search(5));
	}

}
