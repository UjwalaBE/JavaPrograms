package com.javaIO;

import java.io.FileInputStream;

public class ReadOpeartion {

	public static void main(String[] args) {
		
		try{    
            FileInputStream file=new FileInputStream("C:\\New folder\\data.txt");  
            
            int i;    
            
            while((i=file.read())!=-1){    
             System.out.println((char)i);    
            }  
            
            file.close();    
          }
		catch(Exception e){
        	  System.out.println(e);
        	  }    
		
		

	}

}
