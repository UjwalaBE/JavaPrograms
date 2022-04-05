package constructors;

public class Constructors {
	
	int i;
	
	 private Constructors()                       //no argument constructor
	{                               
		System.out.println("no argument constructor");
	}	
	
	 public Constructors(String name){            // with argument constructor
		
		System.out.println(name);
	}
	
	
	// int Constructors() {                 // can not use return type for constructor
		 
	//     }
	
	public static void main(String[] args) {
		
		
		Constructors c=new Constructors();    
		System.out.println(c.i);
		
		Constructors s=new Constructors(); 
		
		Constructors t= new Constructors("ujjwal");
	//	Constructors t=new Constructors("patil");    can not call
	

}
}