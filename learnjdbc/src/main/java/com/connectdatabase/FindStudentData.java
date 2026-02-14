package com.connectdatabase;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class FindStudentData {
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/school";
		String un="postgres";  
		String pwd="root";
		try {
		Class.forName("org.postgresql.Driver");
		Connection connect = DriverManager.getConnection(url, un, pwd);
		Statement stml = connect.createStatement();
		String sql= "select * from student";
		ResultSet res = stml.executeQuery(sql);
		while(res.next()) { 
			System.out.println(res.getInt(1)+" "+ res.getString(2)+" "+ res.getString(3)+" "+ res.getString(4));
		}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
