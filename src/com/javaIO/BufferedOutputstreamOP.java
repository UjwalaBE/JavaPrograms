package com.javaIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferedOutputstreamOP {

	public static void main(String[] args) {
		String s="welcome to java programming";
		
		
		try{
			
			FileOutputStream file=new FileOutputStream("C:\\New folder\\doc.txt");
			
			BufferedOutputStream bin= new BufferedOutputStream(file);
			
			int i;    
		    
			
			
			byte array [] =s.getBytes();
			
			bin.write(array);
					
		    bin.close();    
		    file.close();    
		}
		catch( Exception e){
			
			e.printStackTrace();
			
		}
		// TODO Auto-generated method stub

	}

}
