package exceptionhandle;

import java.util.Scanner;

public class Voting {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sr=new Scanner(System.in);
		
		System.out.println("enter age");
		
		int age=sr.nextInt();
		
		try {
			
			if(age<18) {
				
				//throw new UnderAgeException();
				
				throw new UnderAgeException(" You are not eligible to vote");
				
			}
			else {
				System.out.println(" You can vote");
			}
		}
		catch(UnderAgeException e) {
			
			e.printStackTrace();
		}
		

	}

}
