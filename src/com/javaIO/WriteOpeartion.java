package com.javaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteOpeartion {

	public static void main(String[] args) {

      FileOutputStream file = null;
	try {
		file = new FileOutputStream("C:\\New folder\\data.txt");
	    
		String s="hi,how are you";
		
		byte b[]=s.getBytes();
		file.write(b);
		
		file.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    		  
		
	}

}
