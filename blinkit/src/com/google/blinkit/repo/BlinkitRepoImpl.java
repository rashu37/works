package com.google.blinkit.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.blinkit.dto.BlinkitDto;

public class BlinkitRepoImpl implements BlinkitRepo {

	@Override
	public boolean save(BlinkitDto dto) {
		try {
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Xworkzodc@123");
		String query= "insert into blinkit (p_name,p_brand,p_price,p_quantity,p_ratings) values(?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(query) ;
		statement.setString(1, dto.getProductName());
		statement.setString(2, dto.getProductBrand());
		statement.setInt(3, dto.getProductprice());
		statement.setInt(4,dto.getProductQuantity());
		statement.setInt(5, dto.getProductRatings());
		boolean result=statement.execute();
		
		if(!result) {
			return true;
		}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public List<BlinkitDto> read() {
		List<BlinkitDto> list=new ArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Xworkzodc@123");
			Statement statement = con.createStatement();
			String read = "select * from blinkit;";
			ResultSet resultSet = statement.executeQuery(read);
            while(resultSet.next()){
				
				//create instance 
				BlinkitDto dto= new BlinkitDto();
				dto.setId(resultSet.getInt(1));
				dto.setProductName(resultSet.getString(2));
				dto.setProductBrand(resultSet.getString(3));
				dto.setProductprice(resultSet.getInt(4));
				dto.setProductQuantity(resultSet.getInt(5));
				dto.setProductRatings(resultSet.getInt(6));
				list.add(dto);
			}
		} catch (Exception e) {
             return Collections.emptyList();
		} 

		return list;
		}

	@Override
	public boolean search(int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Xworkzodc@123");
			String search="select * from blinkit where id=?";
			PreparedStatement statement=con.prepareStatement(search);
			statement.setInt(1, id);
			ResultSet result1=statement.executeQuery();
			if(result1.next()) {
				return true;
			}
			}catch(Exception i) {
				i.getMessage();
			}
				return false;
			}

	@Override
	public boolean delete(int id) {
		 try {
			 Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Xworkzodc@123");
		        String query = "delete from blinkit where id = ?";
		        PreparedStatement statement = con.prepareStatement(query);
		        statement.setInt(1, id);
		      boolean result= statement.execute();
		      
		       if(!result) {
		        return true;
		       }
		    } catch (SQLException e) {
		        System.out.println(e.getMessage());
		    }
		return false;
         }

	@Override
	public boolean update(int id, BlinkitDto dto) {
		 try {
			 Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Xworkzodc@123");
			 String query="update  blinkit set p_name=? where id=?";
			 PreparedStatement statement=con.prepareStatement(query);
			 statement.setString(1, "Laptop");
			 statement.setInt(2,id);
			 int result=statement.executeUpdate();
				if(result>0) {
					return true;
				}
			 
		 }catch(Exception o) {
			 o.getMessage();
		 }
		return false;
	}
}
		
	
	
	

	
