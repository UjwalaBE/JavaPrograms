package exceptionhandle;

public class StringIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="ujjwal";
		
		System.out.println(name.length());
		
		try {
			
			for(int i=0;i<=name.length();i++) {
				
				System.out.println(name.charAt(i));
				
			}
		}catch (StringIndexOutOfBoundsException e){
			e.printStackTrace();
			
		}
		
		
	}

}
