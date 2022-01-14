package com.curso.controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.httpclient.HttpClient;

//import com.sun.javafx.util.Logging;

@WebServlet("/SVEjemplo")
public class SVEjemplo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SVEjemplo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("==================================================");
		System.out.println("Java "+System.getProperty("java.version"));
		System.out.println("Classloader de this class :" + SVEjemplo.class.getClassLoader());
		System.out.println("Classloader de BeanUtils  :" + BeanUtils.class.getClassLoader());


        System.out.println("Classloader de HttpClient :" + HttpClient.class.getClassLoader());

        System.out.println("Classloader de ArrayList  :" + ArrayList.class.getClassLoader());
        System.out.println("Classloader of Permission: " + java.sql.SQLPermission.class.getClassLoader());		

        
        response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
