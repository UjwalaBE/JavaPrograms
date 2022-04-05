package com.test;

public class ThisDemo {
	
	
	int i;
	
	void display(int i) {
		
		this.i=i;
	}
	
	void show() {
		System.out.println(i);
	}
	
	
	
	public static void main(String[] args) {
		
		
		ThisDemo d =new ThisDemo();
		 d.display(10);
		 d.show();

	}

}
