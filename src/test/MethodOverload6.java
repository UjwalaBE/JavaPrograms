package test;

public class MethodOverload6 {
	
void test( StringBuffer a) {
		
		System.out.println("object method");
		
	}
	
	void test(String a) {
		
		System.out.println("string method");
	}
	
	
	
	

	public static void main(String[] args) {
		
MethodOverload6 md= new MethodOverload6();
		
		md.test(null);        //ambiguity error  bcoz string and string buffer at same level
	}

}
