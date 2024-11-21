package com.google.blinkitapp.servlets;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.blinkitapp.dto.BlinkitDto;
import com.google.blinkitapp.repository.BlinkitRepoImplimentation;
import com.google.blinkitapp.repository.BlinkitRepository;
import com.google.blinkitapp.service.BlinkitService;
import com.google.blinkitapp.service.BlinkitServiceImplimentation;


@WebServlet(urlPatterns = "/blink")
public class BlinkitServlets extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String pName= req.getParameter("productName");
		String pBrand=req.getParameter("productBrand");
		Integer pPrice=Integer.parseInt(req.getParameter("productPrice"));
		Integer pQuantity= Integer.parseInt(req.getParameter("productQuantity"));
		Integer pRating=Integer.parseInt(req.getParameter("productRatings"));
		
		System.out.println("Product Name:"+pName+" "+"Product Brand:"+pBrand+" "+ "Product Price:"+pPrice+" "+
		"Product Quantity:"+pQuantity+" "+ "Product Ratings:"+pRating);
		
		BlinkitDto dto=new BlinkitDto();
		dto.setProductName(pName);
		dto.setProductBrand(pBrand);
		dto.setProductPrice(pPrice);
		dto.setProductQuantity(pQuantity);
		dto.setProductRatings(pRating);
		
		BlinkitRepository repository=new BlinkitRepoImplimentation();
		BlinkitService service=new BlinkitServiceImplimentation(repository);
		String result=service.onSave(dto);
		System.out.println(result);
		 
		 RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
			requestDispatcher.forward(req, res);
		 
		
	}
	
	
	
}


