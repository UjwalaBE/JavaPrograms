package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperation {

	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("john");
		ar.add("putin");
		ar.add("josh");
		ar.add("priya");
		ar.add("tanvi");
		ar.add("shreya");
		ar.add("sush");
		ar.add("aish");
		ar.add("naveen");
		ar.add("neema");
		
		
		
		ar.add(5, "ujjwal");   //adding to specific index
		
		System.out.println(ar);
		
		ar.set(3, "Pooja");   //updating specific index

		System.out.println(ar);
		
		ar.remove(5);
		
		System.out.println(ar.size());  //size of an array
		
		
		if(ar.indexOf("deep")==-1 ){
			System.out.println("not exist");
			
			
			
			
		}
		else {
			
			System.out.println("exist");
			
		}
		
		
		
		
		
	
		
	
		
		
		//Iteration of array list
		
		//1.for
		
		for(int i=0;i<=(ar.size()-1);i++) {
			
			System.out.println(ar.get(i));
			
		}
		
		//System.out.println("--------------------------------------------");
		
		//for -each
		
		for(String s:ar) {
			
			//System.out.println(s);
		}
		
		
		//iterator
		
		Iterator ir=ar.iterator();
		
		while(ir.hasNext()) {
			
			//System.out.println(ir.next());
		}
		

		
		
		ar.removeAll(ar);
	}

}
