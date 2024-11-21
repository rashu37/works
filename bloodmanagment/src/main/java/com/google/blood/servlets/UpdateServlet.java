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

@WebServlet(urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("get method is Started");
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println("id:" + id);
		BloodManagementRepo rep = new BloodRepoImplimentation();
		BloodService service = new BloodServiceImplimentation(rep);

		BloodManagementDto dto = service.search(id);
		req.setAttribute("updateDto", dto);
		System.out.println("dto:" + dto);

		RequestDispatcher request = req.getRequestDispatcher("update.jsp");
		try {
			request.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("post method from update servlet");

		BloodManagementDto dto = new BloodManagementDto();

		dto.setName(req.getParameter("yourName"));
		dto.setAge(Integer.parseInt(req.getParameter("yourAge")));
		dto.setGroup(req.getParameter("bloodGroup"));

		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println("id:" + id);

		BloodManagementRepo repo = new BloodRepoImplimentation();
		BloodService service = new BloodServiceImplimentation(repo);
		String result = service.update(id, dto);
		req.setAttribute("values", result);

		RequestDispatcher request = req.getRequestDispatcher("view.jsp");
		try {
			request.forward(req, resp);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
