package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperation {

	public static void main(String[] args) {
		
		
		HashSet<String> hs= new HashSet<String>();
		
		hs.add("java");
		hs.add("ruby");
		hs.add("c");
		hs.add("c++");
		hs.add("pearl");
		hs.add("c#");
		hs.add("Python");
		hs.add("angular");
		hs.add("java script");
		hs.add(null);
		hs.add("java");                         // no duplicate element
		                                        // insertion order not maintained
		
		System.out.println(hs);
		
	for(String s:hs) {
		System.out.println(s);
	}
	// ----------------------------------------------------------
	Iterator<String> it=hs.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
//----------------------------------------------------------
		hs.remove("Python");
		
		System.out.println(hs);
		
		
		HashSet<Integer> hm=new HashSet<Integer>();
		
		hm.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
		
		
		
        HashSet<Integer> hm2=new HashSet<Integer>();
		
		hm2.addAll(Arrays.asList(new Integer[] {6,7,8,9,10}));
		
	    HashSet<Integer> union=new HashSet<Integer>(hm);
		
		union.addAll(hm2);
		
		System.out.println(union);
		
	    HashSet<Integer> intersection=new HashSet<Integer>(hm);
	    
	    intersection.retainAll(hm2);
	    
	    System.out.println(intersection);
	    
	     
	    
	    
	    
	    
	    
	    
	    
	    
	      
	       
	       
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
}
