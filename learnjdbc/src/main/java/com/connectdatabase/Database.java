package com.connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/school";
		String un="postgres";  
		String pwd="root";
		try {
		Class.forName("org.postgresql.Driver");
		Connection connect = DriverManager.getConnection(url, un, pwd);
		Statement stml = connect.createStatement();
		String sql = "create database college";
		 stml.executeUpdate(sql);

         System.out.println("Database created successfully!");

         // Close connection
         stml.close();
         connect.close();}catch(ClassNotFoundException e) {
 			e.printStackTrace();
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} 
 		
	}

}
