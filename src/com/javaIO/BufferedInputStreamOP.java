package com.javaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamOP {

	public static void main(String[] args) {
		
		
		try{
			
			FileInputStream file=new FileInputStream("C:\\New folder\\data.txt");
			
			BufferedInputStream bin= new BufferedInputStream(file);
			
			int i;    
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    bin.close();    
		    file.close();    
		}
		catch( Exception e){
			
			e.printStackTrace();
			
		}
		
		

	}

}
