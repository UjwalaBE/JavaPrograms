package com.javaIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		File file=new File("C:\\New folder\\data.txt");
		
		FileReader fr = null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			BufferedReader br = new BufferedReader(fr);
			
			String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
		}
		}
            catch(IOException e) {
            	
            	e.printStackTrace();
            }
            	
            
		
		
		
		
		
		

	}

}
