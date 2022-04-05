package exceptionhandle;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EofException {

	public static void main(String[] args) {
		
		 
	     File file=new File("C:C/Users/name.txt");
	     FileInputStream fs=null;
	     
	     try {
			fs=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     try {
	    	 
	     
		
		DataInputStream ds=new DataInputStream(fs);
		while(true) {
	         char ch;
	         ch = ds.readChar();
	         System.out.print(ch);
	      }
		
		
	     }
	      catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		// TODO Auto-generated method stub

	}

}
