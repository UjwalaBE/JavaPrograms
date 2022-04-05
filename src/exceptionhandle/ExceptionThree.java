package exceptionhandle;

public class ExceptionThree {
	
	void sum() {
		
		int a=100,b=0,c;
		 c=(a/b);
		 System.out.println(c);
		
	}
	
	                        

	public static void main(String[] args) {
		
		ExceptionThree e=new ExceptionThree();
		e.sum();                                      //  java.lang.ArithmeticException: / by zero
		// TODO Auto-generated method stub

	}

}
