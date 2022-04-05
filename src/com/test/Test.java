package com.test;

 class Test implements InterfaceI1, InterfaceI2 {

	public void show() {
		System.out.println(" i am in show");

		// TODO Auto-genera method stub
 
	}
	
	public void show1() {
		System.out.println("i am in show1");
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		t.show();
		t.show1();

	}

}
