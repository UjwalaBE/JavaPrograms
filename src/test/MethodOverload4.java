package test;

public class MethodOverload4 {
	
	void  show(int a,int b) {
		
	System.out.println(" i am in first show");
		
		
	}

	
	
	void show(char a,char b) {
		
		System.out.println("i am in second show");
		
		

	}



public static void main(String[] args) {
		
		MethodOverload4 md=new MethodOverload4();
		  
		md.show(10,20);
		md.show('c', 10);        //calling first method  automatic promotion
		
		md.show('t',20);
		
	}



}




