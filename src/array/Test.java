package array;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		Employee e1=new Employee(102,"ujj","rag");
		Employee e2=new Employee(121,"sri","Tcs");
		Employee e3=new Employee(141,"rag","Tcs");
		
		ArrayList<Employee> er2 =new ArrayList<Employee>();
		er2.add(e1);
		er2.add(e2);
		er2.add(e3);
		
		
		Iterator<Employee> it =er2.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.emp_id);
			System.out.println(emp.name);
			System.out.println(emp.comp_name);
			
					
		}
		
		
	ArrayList<String> num= new ArrayList<String>();
	num.add("ujj");
	num.add("sri");
	num.add("ujj");
	num.add("pri");
	
	ArrayList<String> num1= new ArrayList<String>();
	num1.add("ujj");
	num1.add("ehi");
	num1.add("ujj");
	num1.add("pji");
	
	int i;
	
	num.retainAll(num1);
	for(i=0;i<num.size();i++) {
		System.out.println(num.get(i));
	}
		
		
		
		
		
		
		
	
		// TODO Auto-generated method stub

	}

	private static char[] retainall(ArrayList<String> num) {
		// TODO Auto-generated method stub
		return null;
	}

}
