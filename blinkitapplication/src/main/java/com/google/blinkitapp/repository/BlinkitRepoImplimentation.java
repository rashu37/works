package com.google.blinkitapp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.google.blinkitapp.dto.BlinkitDto;



public class BlinkitRepoImplimentation implements BlinkitRepository{
	@Override
	public boolean save(BlinkitDto dto) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/clssql","root","Xworkzodc@123");
			String query="insert into blinkit (p_name,p_brand,p_price,p_quantity,p_ratings) values(?,?,?,?,?)";
			PreparedStatement statement = connect.prepareStatement(query) ;
			
			
			statement.setString(1, dto.getProductName());
			statement.setString(2, dto.getProductBrand());
			statement.setInt(3, dto.getProductPrice());
			statement.setInt(4,dto.getProductQuantity());
			statement.setInt(5, dto.getProductRatings());
			
			boolean result=statement.execute();
			System.out.println(result);
			if(!result) {
				
				return true;
			}
			}catch(ClassNotFoundException |  SQLException e) {
			 System.out.println(e.getMessage());	
			 e.printStackTrace();
			}
		
		return false;
	}


}
