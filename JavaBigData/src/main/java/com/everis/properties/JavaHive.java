package com.everis.properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.zookeeper.KeeperException.SystemErrorException;

public class JavaHive {
	public static final String DRIVER_CLASS = "org.apache.hive.jdbc.HiveDriver";
	public static final String CONNECTION_URL = "jdbc:hive2://localhost:10000/terere;ssl=false";
	public static final String USER = "cloudera";
	public static final String PASSWORD = "cloudera";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection connection = null;
		Class.forName(DRIVER_CLASS);
		connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
		Statement stmt = connection.createStatement();
		
		//System.err.println();
		
		String query1="INSERT INTO terere.XUAA VALUES(5,\"DIEGO DO SANTOS TERERE\")";
		//String query2="SELECT NOME FROM TERERE.XUAA";
		
		//PreparedStatement ps = connection.prepareStatement(query2);
		
		stmt.executeUpdate(query1);
		
		//ResultSet rs = stmt.executeQuery(query2);
		//ResultSet rs2 = ps.executeQuery();
		

//		while (rs.next()) {
//			System.out.println(rs.getString("NOME"));
//		}
		
		System.out.println("\n\n ----------------------------------------------------- \n\n");
		
//		while (rs2.next()) {
//			System.out.println(rs2.getString("NOME"));
//		}
		
		//rs.close();
		//rs2.close();
		stmt.close();
		//ps.close();
		connection.close();
	}
}
