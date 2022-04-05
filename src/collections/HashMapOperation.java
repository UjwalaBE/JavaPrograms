package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapOperation {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "Ajay");
		hm.put(102, "Priya");
		hm.put(103, "pooja");
		hm.put(104, "Shree");
		hm.put(105, "rahul");
		hm.put(106, "somya");
		hm.put(107, "kajal");
		hm.put(108, "leela");
		hm.put(109, "suman");
		hm.put(110, "Atul");
		
		
		System.out.println(hm);
		
		//getting key values
		
		for(Entry<Integer, String> e:hm.entrySet()) {
			
			System.out.println(e.getKey()+" "+e.getValue());
			
			
		}
  
		
	HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		
		
		System.out.println( hm.clone());
		
		System.out.println(hm.containsKey(108));
		
		System.out.println(hm.containsValue("Shree"));
		
		System.out.println("Is hashmap is empty ? " + hm.isEmpty());
		
		
		
		System.out.println(hm.size());
		
		
		//printing only keys
		
for(Entry<Integer, String> e:hm.entrySet()) {
			
			System.out.println(e.getKey());
			
			
		}




//printing only values


for(Entry<Integer, String> e:hm.entrySet()) {
	
	System.out.println(e.getValue());
	
	
}
		
	 
   hm.remove(103);
   
   System.out.println(hm);
   
   hm2.putAll(hm);
   
   
   System.out.println(hm2);
   
   
   
		
		
	}

}
