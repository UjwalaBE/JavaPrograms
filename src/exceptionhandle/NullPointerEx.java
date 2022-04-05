package exceptionhandle;

public class NullPointerEx {

	public static void main(String[] args) {
		
		
		
		String s=null;
		try {
		
		System.out.println(s.length());
		
		
		
		// TODO Auto-generated method stub

	}
		catch(NullPointerException e){
			e.printStackTrace();
			
		}
		

}
}