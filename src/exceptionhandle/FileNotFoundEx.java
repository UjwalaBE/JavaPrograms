package exceptionhandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File file=new File("C:/C/Users/name.txt");
		FileInputStream fs=null;
		
		try {
			fs=new FileInputStream(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(fs.available());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
