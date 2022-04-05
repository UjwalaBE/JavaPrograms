package exceptionhandle;

public class ExceptionFour {

	public static void main(String[] args) {
		
		try {
			
			int a=100,b=0,c;
			c=(a/b);
			
			System.out.println(c);
			
			String s=null;
			
			System.out.println(s.length());
			
			
		}
		
		catch(ArithmeticException  e) {
			
			e.printStackTrace();
			
			
		}
		
	    catch(NullPointerException t) {
	    	
	    	t.printStackTrace();
	    }
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
