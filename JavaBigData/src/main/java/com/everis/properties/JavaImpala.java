package com.everis.properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaImpala {
	public static final String DRIVER_CLASS = "org.apache.hive.jdbc.HiveDriver";
	public static final String CONNECTION_URL = "jdbc:hive2://localhost:21050/terere;ssl=false";
	public static final String USER = "cloudera";
	public static final String PASSWORD = "cloudera";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection connection = null;
		Class.forName(DRIVER_CLASS);
		connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
		Statement stmt = connection.createStatement();

		// String query1="INSERT INTO terere.XUAA VALUES(4,\"SILVIO SANTOS\")";
		String query2 = "SELECT NOME FROM TERERE.XUAA";
		String query3 = "SHOW TABLES";

		//PreparedStatement ps = connection.prepareStatement(query2);
		PreparedStatement ps = connection.prepareStatement(query3);

		// stmt.executeUpdate(query1);

		ResultSet rs = stmt.executeQuery(query2);
		ResultSet rs2 = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString("NOME"));
		}

		System.out.println("\n\n ----------------------------------------------------- \n\n");

		while (rs2.next()) {
			//System.out.println(rs2.getString("NOME"));
			System.out.println(rs2.getObject(0));
		}
		
		// TODO

		rs.close();
		rs2.close();
		stmt.close();
		connection.close();
	}
}
