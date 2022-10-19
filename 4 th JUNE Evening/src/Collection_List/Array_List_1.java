package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_1 {

	public static void main(String[] args) {

		//  int [] arr = new int [5]; // Static Array + Homogeneouse/ Simillar Data Type
        //  arr[0]= 4;	
		
		ArrayList <String>  AL1 = new <String> ArrayList(); // Homogeneous Data type
		
		ArrayList AL2 = new ArrayList(); // fixed in size
		
		ArrayList AL = new ArrayList(); // Dynamic Array + Different Data Type
		
		AL.add(100);
		AL.add("Velocity");
		AL.add('A');
		AL.add(true);
		AL.add(250);
		AL.add(null);
		AL.add(25.8);
		AL.add(null);
	    AL.add('A');
	    
		System.out.println(AL);
		System.out.println();
		
		// 2) Size --> Returns the number of elements in this list.
		System.out.println("Number of element in given Array :" + AL.size());
		System.out.println();
		
		// 3) Remove --> Removes the specified element at specified index from this list
		  AL.remove(25.8); 
		  AL.remove(2);
		  System.out.println(AL); 
		                          
		  System.out.println();
		
		// 4) add -->Insert new element into list at specified index
    	  AL.add(78.45);
    	  AL.add(49); 
    //	  AL.add(0, AL);
		  System.out.println(AL);
		 
		  AL.add(1, "WELCOME");
		  System.out.println(AL);
		  System.out.println();
		  
		// 5) get() --> Returns the element at the specified position in this list.
		  System.out.println(AL.get(1));
		  System.out.println(AL.get(4));
		  System.out.println();
		  
		// 6) set() --> Change/Replace Element --> Insert new element into list at specified index
		  AL.set(2, "PUNE");
		  System.out.println(AL);
		  
		  AL.set(4, false);
		  System.out.println(AL);
		  System.out.println();
		// 7) Contains -  Search Element // return type - boolean(true/false)
		// Returns true if this list contains the specified element is match

		  System.out.println(AL.contains("WELCOME"));
		  System.out.println(AL.contains(null));
		  System.out.println(AL.contains("Velocity"));
		  System.out.println(AL.contains(78.45));
		  System.out.println();
		  
		// 8) isEmpty -->> to check where Arraylist is empty or not
		// Returns true if this list contains no elements.

		  System.out.println(AL.isEmpty());
		  System.out.println(AL2.isEmpty());
		  
		  
	    // 9) read / print the data from array list by using (for loop, for eacg loop, iterator)
		// Returns the number of elements in this list.

		  System.out.println(AL.size());
		  System.out.println();
		  
		  System.out.println("Reading element using for loop");

		  
		  for (int i=0; i<AL.size(); i++) {
			  System.out.println(AL.get(i));
		  }
		  System.out.println();
		  
		  System.out.println("Reading element using foreach loop/advance forloop");
		  
		  for(Object obj : AL) {
			  System.out.println(obj);
		  }
		  System.out.println();
		  
		  System.out.println("Reading element using iterator");
		  
		  Iterator it = AL.iterator();
			  
			  while(it.hasNext()) {
				  System.out.println(it.next());
				  
			  }
	}

}
