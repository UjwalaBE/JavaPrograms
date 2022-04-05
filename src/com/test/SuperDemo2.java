package com.test;

public class SuperDemo2 extends SuperDemo {
	
	void display() {
		super.show();
		this.show();
		System.out.println("i am in display");
	}

	public static void main(String[] args) {
		
		SuperDemo2 sd=new SuperDemo2();
		sd.display();
		
		// TODO Auto-generated method stub

	}

}
