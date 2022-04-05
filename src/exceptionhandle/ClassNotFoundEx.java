package exceptionhandle;

public class ClassNotFoundEx {

	public static void main(String[] args) {
		
		
		
		
		 try {
			 
	            Class.forName("Template"); // we don't have class "Template"
	        }
	 
	        // Catch block to handle exceptions
	        catch (ClassNotFoundException e) {
	 
	            
	            e.printStackTrace();
	        }
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
