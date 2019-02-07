package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	public Connection start() {
		
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC", "springstudent", "springstudent");
		}
		
		catch(ClassNotFoundException|SQLException e) {
			System.out.println(e);
			
		}
		
		return con;
	}
}

