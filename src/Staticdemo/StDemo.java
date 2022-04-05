package Staticdemo;

public class StDemo {
	static void  show() {
		System.out.println("static words");
	}
	
	public static void main(String args[]) {
		
		StDemo.show();
		Test.dilay();
	}
}
class Test{
	 static void dilay() {
		 System.out.println(" test");
	 }
}
