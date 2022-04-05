package com.javaIO;

import java.io.FileWriter;

public class FileWriterOP {

	public static void main(String[] args) {
		
		
		
		try{    
	           FileWriter fw=new FileWriter("C:\\New folder\\doc.txt"); 
	           
	           fw.write("Welcome to java Programming."); 
	           
	           fw.close();    
	          }
		catch(Exception e){
			System.out.println(e);
			}    
	          System.out.println("Success...");    
		
		
		
		
		// TODO Auto-generated method stub

	}

}
