package com.TestNG.TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException 
	{
		//step1:convert physical file into java readable object 
		FileInputStream fis=new FileInputStream ("./src/test/java/commondats.properties");
		
		//step2: create an instance of properties class
		//properties class is available in java.util package
		Properties p=new Properties();
		p.load(fis);
		 String url = p.getProperty("url");
		 long time=Long.parseLong(p.getProperty("timeouts"));
		 System.out.println(url+"\t"+time);
		 

		
		// TODO Auto-generated method stub

	}

}
