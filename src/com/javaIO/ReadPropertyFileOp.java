package com.javaIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFileOp {

	public static void main(String[] args) {
		
		
		try {
			FileReader file = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\java-Selenium\\Interfacedemo\\src\\com\\javaIO\\data.properties");
			
			Properties prop = new Properties() ;
			
			prop.load(file);
			
			System.out.println(prop.getProperty("UserName"));
			
			System.out.println(prop.getProperty("password"));
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		



	}

}
