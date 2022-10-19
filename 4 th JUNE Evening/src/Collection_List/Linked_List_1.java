package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List_1 {

	public static void main(String[] args) {

		LinkedList LL = new LinkedList(); // Hetrogeneuose // dynamic
		
		LinkedList <String> LL1 = new LinkedList<String>(); // Homogeneuose // static
		
		// Add // to performe insertion operation in liknedlist // insreting element into linkedlist
		
		LL.add(3500);
		LL.add("Welcome");
		LL.add('#');
		LL.add(true);
		LL.add(38.45);
		LL.add(null);
		LL.add(false);
		LL.add(null);
		LL.add('#');
		
		LL.remove(null);
		System.out.println(LL);
		

		System.out.println(LL);
		System.out.println();
		
		// 1) to find size of linkedlist --> Returns the number of elements in this list.
		
		System.out.println(LL.size());
		
		// 2) Remove element from linkedlist --> Removes the specified element at specified index from this list.
		
		LL.remove(null);
		System.out.println(LL);
		
		// add()  --> Insert new element into list at specified index
		LL.add(4000);
		System.out.println(LL);
		
		LL.add(0, 4000);
		System.out.println(LL);
		
		// 3) get(); --> Returns the element at specified position in the list
		
		System.out.println(LL.get(2));
		
		//firstindex --> retruns the first element from the list
		
		System.out.println(LL.getFirst());
		
		// lastindex --> retruns the last element from the list
		
		System.out.println(LL.getLast());
		
		// 4) set --> Insert new element into list at specified index
		
		LL.set(3, "hi");
		System.out.println(LL);
		
		// 5) isEmpty -->> to check weather list is empty or not
		// Returns true if this list contains no elements. 
		
		System.out.println(LL.isEmpty());
	    System.out.println(LL1.isEmpty());
	    
	    // 6) Contains -->  To Check Element // return type - boolean(true/false) // to match element from list 
		// Returns true if this list contains the specified element is match

	    System.out.println(LL.contains("Velocity"));
	    System.out.println(LL.contains(4000));
	    System.out.println();
	    
	    //  Reading element by using for loop
	    
	    System.out.println(	"Reading element by using for loop");
	    
	    for (int i=0; i<LL.size(); i++) {
	    	
	    	System.out.println(LL.get(i));
	    }
	    System.out.println();
	    System.out.println(	"Reading element by using for each loop/ advance loop");
	    
	    for(Object obj : LL) {
	    	
	    	System.out.println(obj);
	    }

	    System.out.println();
	    
	    System.out.println(	"Reading element by using Iterator");
	    
	    Iterator it = LL.iterator();
	    
	    while (it.hasNext()) {
	    	
	    	System.out.println(it.next());
	    }

	}

}
