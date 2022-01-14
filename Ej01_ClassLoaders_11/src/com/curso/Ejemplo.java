package com.curso;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

import org.apache.commons.beanutils.BeanUtils;

//Está en lib/ext
//import com.sun.javafx.util.Logging;

public class Ejemplo {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, IOException {

		System.out.println("==================================================");
		System.out.println("Java " + System.getProperty("java.version"));
		System.out.println("Classloader de this class :" + Ejemplo.class.getClassLoader());
		System.out.println("Classloader de BeanUtils  :" + BeanUtils.class.getClassLoader());

		// System.out.println("Classloader de Logging :" +
		// Logging.class.getClassLoader()); //De JavaFX

		System.out.println("Classloader de ArrayList  :" + ArrayList.class.getClassLoader());
		System.out.println("Classloader of Permission: " + java.sql.SQLPermission.class.getClassLoader());

		System.out.println("==================================================");
		URL[] classLoaderUrls = new URL[] { new URL("file:conversor.jar") };
		URLClassLoader urlClassLoader = new URLClassLoader(classLoaderUrls);
		Class<Conversor> conversorClass = (Class<Conversor>) urlClassLoader.loadClass("com.curso.ConversorMayusculas");

		// Conversor conversor = conversorClass.newInstance();
		Conversor conversor = conversorClass.getConstructor().newInstance();
		System.out.println("Classloader of Conversor  :" + conversor.getClass().getClassLoader());
		System.out.println(conversor.convertir("hola radiola"));

		urlClassLoader.close();

	}
}
