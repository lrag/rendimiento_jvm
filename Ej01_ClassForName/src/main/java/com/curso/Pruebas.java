package com.curso;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pruebas {

	public static void main(String[] args) throws SQLException {
		
		//Si hacemos esto nos acoplamos en el código a Mysql :(
		//Driver d = new com.mysql.jdbc.Driver();
		
		
		Driver d = null;
		
		try {
			//Esta cadena de texto la leeríamos de un fichero de configuración...
			Class<Driver> driverClass = (Class<Driver>) Class.forName("com.mysql.jdbc.Driver");
			//d = driverClass.newInstance();
			d = driverClass.getDeclaredConstructor().newInstance();
			System.out.println(d);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		//Driver d = new Driver();
		Connection cx = d.connect("url", null);
		//PreparedStatement pst = cx.prepareStatement("SQL");
		//ResultSet rs = pst.executeQuery();
		
	}
	
}
