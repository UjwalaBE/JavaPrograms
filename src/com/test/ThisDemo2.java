package com.test;

public class ThisDemo2 {
	
	ThisDemo2(){
		
		System.out.println("no-arg constructor");
		
		//this(10); shows error
		
	}
	
	ThisDemo2(int i){
		
		this();
		
		System.out.println(i);
	}
	
	

	public static void main(String[] args) {
		
	ThisDemo2 td=new ThisDemo2(10);	

		// TODO Auto-generated method stub

	}

}
