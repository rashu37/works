package com.google.connection.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionRunner {
     public static void main(String[] args) {
	
    	 System.out.println("JDBC connection");
    	 try {
    		 Class.forName(ConnectionUtil.DRIVERNAME);
    		 Connection connection=DriverManager.getConnection(ConnectionUtil.USERNAME,ConnectionUtil.JDBCURL,ConnectionUtil.PASSWORD);
    		 System.out.println("Connection:"+connection.getSchema());
    		 
    	 }catch(ClassNotFoundException | SQLException e) {
    		 System.out.println(e.getMessage());
    	 }
     
     
     }
     
    

}
