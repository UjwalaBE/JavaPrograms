package test;

public class MethodOverload7 {
	
	
	void show(int a,int b) {
		
		System.out.println("first method");
	}
	
	int show(int a,int b) {
		
		System.out.println("second method");
	}

public static void main(String[] args) {
		
		
  MethodOverload7 md= new MethodOverload7();
		
		md.show(10,20);    //string
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
