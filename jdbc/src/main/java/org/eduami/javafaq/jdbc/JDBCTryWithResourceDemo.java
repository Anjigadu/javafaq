package org.eduami.javafaq.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//Slightly cleaner code
public class JDBCTryWithResourceDemo {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/demo";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "Test@123";

	public static void main(String[] args) throws ClassNotFoundException {

		String sql = "SELECT id, name FROM Employee";

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", "Test@123");
				PreparedStatement ps = con.prepareStatement(sql);) {

			try (ResultSet rs = ps.executeQuery();) {
				while (rs.next()) {
					// Retrieve by column name
					int id = rs.getInt("id");
					String name = rs.getString("name");

					// Display values
					System.out.print("ID: " + id);
					System.out.println(", Name: " + name);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// end main
}// end FirstExample