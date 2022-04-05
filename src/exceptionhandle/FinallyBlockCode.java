package exceptionhandle;

public class FinallyBlockCode {

	public static void main(String[] args) {
		try {
		
		String s=null;
		
	 System.out.println(s.length());
	 
	 


	}
		
		catch(NullPointerException e) {
			
			e.printStackTrace();
		}
		
		finally {
			
			System.out.println(" I am in finally block");
		}
		
		}

}
