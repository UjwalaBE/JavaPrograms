package exceptionhandle;

public class ArrayOutOfBoundEx {

	public static void main(String[] args) {
		
		try {
			
			int a[] =new int[5];
			
			a[0]=2;
			a[1]=3;
			a[2]=4;
			a[3]=5;
			a[5]=10;
			a[6]=30;
			a[7]=41;
			
			
		
			
		}
		
		catch( ArrayIndexOutOfBoundsException  e) {
			
			e.printStackTrace();
			
		}
		

	}

}
