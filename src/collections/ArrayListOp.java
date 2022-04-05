package collections;

import java.util.ArrayList;

public class ArrayListOp {

	public static void main(String[] args) {
		
		
		ArrayList<String> ar1 =new ArrayList<String>();
		
		ar1.add("java");
		ar1.add("Python");
		ar1.add("rubby");
		
		System.out.println(ar1);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		 ar2.add("c");
		 ar2.add("c++");
		 ar2.add("Pearl");
		 
		 System.out.println(ar2);
		 
		 ar1.addAll(ar2);
		 
		 System.out.println(ar1);
		 
		 for(int i=0;i<=(ar1.size()-1);i++) {
			 
			 System.out.println(ar1.get(i));
		 }
		
		
		ar1.removeAll(ar2);
		
		System.out.println(ar1);
		
		
		
		
	}

}
