package test;

public class MethodOverload2 {
	
	
	void test(int a) {
		
		System.out.println("i am in first  test");
	}
	
	
	void test( int a,char b) {
		
		System.out.println(" i am in second test");
	}
	

	public static void main(String[] args) {
		
		MethodOverload2 md=new MethodOverload2();
		
		md.test(15);
		md.test(15,'c');
		
		
		
		// TODO Auto-generated method stub

	}

}
