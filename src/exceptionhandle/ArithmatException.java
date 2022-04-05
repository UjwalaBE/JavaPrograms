package exceptionhandle;

public class ArithmatException {

	public static void main(String[] args) {
		
		
try {
			
			int a=100, b=0, c;
			
			c=(a/b);
		}
		// TODO Auto-generated method stub
        catch( Exception e){
        	
        	System.out.println(e);          //java.lang.ArithmeticException: / by zero
        	e.printStackTrace();            // printing complete message "ava.lang.ArithmeticException: / by zero at exceptionhandle.ExceptionTwo.main(ExceptionTwo.java:11)"
        	
        	
        	
	
	
}
		
		System.out.println(" hellow");
		// TODO Auto-generated method stub

	}

}
