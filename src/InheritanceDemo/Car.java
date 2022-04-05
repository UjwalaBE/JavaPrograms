package InheritanceDemo;

public class Car extends Drive {
	
	
    void ferrari() {
		
		System.out.println("ferrari");
	}
	
	void mercedes() {
		
		System.out.println("mercedes");
	}
	
	void display() {
		 System.out.println(" car display");
	}




public static void main(String[] args) {
	
	Vehicle v= new Vehicle();
	v.display();
	v.show();
	v.play();
	
	Drive d= new Drive();
	d.display();
	d.driveWithKey();
	d.driveWithKick();

	
	Car c=new Car();
	c.display();
	c.ferrari();
	c.mercedes();
	 
	Vehicle vs= new Car(); 
	
	                               
	vs.display();         //Call an overridden method with super class reference
	 
	
	Vehicle tt=new Drive();
	
	tt.display();
	
	

}




}