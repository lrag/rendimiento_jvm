package com.curso;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pruebas {

	public static void main(String[] args) throws SQLException {
		
		Driver d = null;
		
		try {
			Class<Driver> driverClass = (Class<Driver>) Class.forName("com.mysql.jdbc.Driver");
			d = driverClass.newInstance();
			System.out.println(d);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		//Driver d = new Driver();
		Connection cx = d.connect("url", null);
		//PreparedStatement pst = cx.prepareStatement("SQL");
		//ResultSet rs = pst.executeQuery();
		
	}
	
}
