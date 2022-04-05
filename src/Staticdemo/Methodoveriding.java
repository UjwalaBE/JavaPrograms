package Staticdemo;

public class Methodoveriding {
	
	public void Test(String x) {
		System.out.println(" non-static method");
}
	
	public static int Test(Integer x) {
		System.out.println(" static method");
		return x;
		
	}
	
	
	public static void main(String[]args) {
		Methodoveriding t =new Methodoveriding();
		t.Test("jkk");
		 Methodoveriding.Test(10);
	}
}


	