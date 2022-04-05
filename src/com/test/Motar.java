package com.test;

public class Motar implements Vehicle {

	@Override
	public void start() {
		
		System.out.println("start motor");
	}

	public void stop() {
		System.out.println(" stop motor");  //if not implemented one of this method gives error
}



	public static void main(String[] args) {
		
		
		Motar  m=new Motar();
	
		m.start();
		m.stop();
		
	}







}




