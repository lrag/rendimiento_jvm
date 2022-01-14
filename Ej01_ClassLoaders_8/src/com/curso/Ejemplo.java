package com.curso;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.httpclient.HttpClient;

import com.sun.javafx.util.Logging;

public class Ejemplo {

	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		List<String> movidas = new ArrayList<>();
		
		System.out.println("========================================================================");
		System.out.println("Java "+System.getProperty("java.version"));
		
		//Clase en el classpath (programada por nosotros)
		System.out.println("Classloader de this class :" + Ejemplo.class.getClassLoader());
		//Clase en el classpath (en una libreria que hemos añadido al proyecto)
		System.out.println("Classloader de BeanUtils  :" + BeanUtils.class.getClassLoader());
		
		
		//Clases que están en las extensiones
		System.out.println("Classloader de Logging    :" + Logging.class.getClassLoader()); //De JavaFX
		//Clase que está en una librería añadida ilegalmente a lib/ext
		System.out.println("Classloader de HttpClient :" + HttpClient.class.getClassLoader());
		
		//Api de Java
        System.out.println("Classloader de ArrayList  :" + ArrayList.class.getClassLoader());
        System.out.println("Classloader of Permission :" + java.sql.SQLPermission.class.getClassLoader());
        
        /*
        Class x = Class.forName("org.apache.commons.httpclient.HttpClient");
        System.out.println(x);
        */

        System.out.println("========================================================================");
        URL[] classLoaderUrls = new URL[]{new URL("file:conversor.jar")};
        URLClassLoader urlClassLoader = new URLClassLoader(classLoaderUrls);
       
        @SuppressWarnings("unchecked")        
        Class<String> stringClass = (Class<String>) urlClassLoader.loadClass("java.lang.String");
        System.out.println("Classloader de String:"+stringClass.getClassLoader());
       
        @SuppressWarnings("unchecked")        
		Class<Conversor> conversorClass = (Class<Conversor>) urlClassLoader.loadClass("com.curso.ConversorMayusculas");
        Conversor conversor = conversorClass.newInstance();
        
        System.out.println("Classloader de ConversorMayusculas:" + conversor.getClass().getClassLoader());
        System.out.println(conversor.convertir("hola radiola"));
                
        urlClassLoader.close();
        
    }
}

