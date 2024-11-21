package com.google.blood.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.blood.dto.BloodManagementDto;

public class BloodRepoImplimentation implements BloodManagementRepo {

	@Override
	public boolean save(BloodManagementDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root",
					"Xworkzodc@123");

			String query = "insert into blood (name,age,blood_group) values(?,?,?)";
			PreparedStatement statement = connect.prepareStatement(query);
			statement.setString(1, dto.getName());
			statement.setInt(2, dto.getAge());
			statement.setString(3, dto.getGroup());
			boolean result = statement.execute();
			if (!result) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
		return false;
	}

	@Override
	public List<BloodManagementDto> read() {
		List<BloodManagementDto> list = new ArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root",
					"Xworkzodc@123");
			Statement statement = con.createStatement();
			String read = "select * from blood;";
			ResultSet resultSet = statement.executeQuery(read);
			while (resultSet.next()) {
				BloodManagementDto dto = new BloodManagementDto();
				dto.setId(resultSet.getInt(1));
				dto.setName(resultSet.getString(2));
				dto.setAge(resultSet.getInt(3));
				dto.setGroup(resultSet.getString(4));
				list.add(dto);
			}
		} catch (Exception e) {
			return Collections.emptyList();
		}
		return list;
	}

	@Override
	public boolean delete(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root",
					"Xworkzodc@123");
			String query = "delete from blood where id=?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, id);
			boolean result = statement.execute();
			if (!result) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return false;
	}

	@Override
	public boolean update(int id, BloodManagementDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root",
					"Xworkzodc@123");
			String query = "update blood set name=?,age=?,blood_group=? where id=?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, dto.getName());
			statement.setInt(2, dto.getAge());
			statement.setString(3, dto.getGroup());
			statement.setInt(4, id);
			int result = statement.executeUpdate();
			if (result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return false;
	}

	@Override
	public BloodManagementDto search(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root",
					"Xworkzodc@123");
			String search = "select * from blood where id=?";
			PreparedStatement statement = con.prepareStatement(search);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				BloodManagementDto dto = new BloodManagementDto();
				dto.setId(resultSet.getInt(1));
				dto.setName(resultSet.getString(2));
				dto.setAge(resultSet.getInt(3));
				dto.setGroup(resultSet.getString(4));
				return dto;
			}
		} catch (Exception i) {
			i.getMessage();
		}
		return new BloodManagementDto(); // null
	}

}
