package test;

public class MethodOverload {
	
	
	void show(int a) {
		
		System.out.println("show first method");
	}
	
	void show(int a,int b) {
		
		System.out.println("show second method");
		
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		MethodOverload md=new MethodOverload();
		  
		md.show(10);
		md.show(10,20);
		
	}

}
