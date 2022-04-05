package test;

public class MethodOverload5 {
	
	void test( Object a  ) {
		
		System.out.println("object method");
		
	}
	
	void test(String a) {
		
		System.out.println("string method");
	}
	
	

	public static void main(String[] args) {
		
		MethodOverload5 md= new MethodOverload5();
		
		md.test("abc");    //string method will call bcoz compiler will give preference to child class 
		 
		// TODO Auto-generated method stub

	}

}
