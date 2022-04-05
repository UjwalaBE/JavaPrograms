package com.test;

public class Test2 implements InterfaceT2 {

	@Override
	public void start() {
		
		System.out.println("start the car");
		// TODO Auto-generated method stub
		
	}

   @Override
	public void stop() {
		
		System.out.println("stop the car");
		
		System.out.println(a);
	}

	
	

	public static void main(String[] args) {
		
		Test2 t2=new Test2();
		 t2.start();
		 t2.stop();
	

}
}