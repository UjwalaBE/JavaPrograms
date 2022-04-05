package constructors;

public class Employee {
	
	
	String name;
	int salary;

	public Employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 Employee e  = new  Employee("raj",1000);
		 Employee t= new Employee("tcs",101);
		 System.out.println(e.name+" " +e.salary);
		 System.out.println(t.name+" "+t.salary);
		
	}


	
	
	
	
	

}
