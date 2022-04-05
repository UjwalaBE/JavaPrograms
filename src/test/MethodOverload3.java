package test;

public class MethodOverload3 {
	
	
	void play(int a,char b) {
		
		System.out.println("i am in first play");

	}
	
	void play(int a,char b) {
		
		System.out.println(" i am in second play");
		
		
	}

	public static void main(String[] args) {
		
		MethodOverload3 md= new MethodOverload3();
		
		//md.play(10, 'y');
		md.play(20,'k');
		
		// TODO Auto-generated method stub

	}

}
