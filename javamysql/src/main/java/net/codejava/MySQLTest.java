package net.codejava;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLTest {

	public static void main(String[] args) {
	
		String url1 = "jdbc:mysql://localhost:3306/vicky";
		String user = "root";
		String password = "Vignesh@11";
        
		try {
	         Connection connection = DriverManager.getConnection(url1, user, password);
	         
	         String sql = "SELECT * FROM customer";
	         Statement statement = connection.createStatement();
	         ResultSet result = statement.executeQuery(sql);
	         
	         while(result.next()) {
	        	int employee_id = result.getInt("employee id");
	        	 String firstname = result.getString("First name");
	        	 String lastname = result.getString("Last name");
	        	 int age = result.getInt("Age");
	        	 String position = result.getString("Position");
	        	 System.out.println(employee_id + " " + firstname + " "+ lastname +" "+age+" "+position);
	        	 
	         }
	         connection.close();
		} catch (SQLException e) {
			System.out.println("oops!");
			e.printStackTrace();
		}

	}

}