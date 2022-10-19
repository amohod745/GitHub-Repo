package Collection_List;

import java.util.HashSet;

public class Hash_set3 {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add(2);
		hs.add(19);
		hs.add(97);
		
	
		// duplicates are not allowed in HashSet 
		
		System.out.println(hs);
		System.out.println();
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(11);
		hs1.add(5);
		hs1.add(19);
		hs1.add(95);
		System.out.println(hs1);


		// union --> only unique element will displayed
		
 //  	hs.addAll(hs1);
//		System.out.println("union :"+hs);
		
		// interaction --> only common element is displayed
	
	    hs.retainAll(hs1);
	    System.out.println("Common :"+ hs);
	
	// difference
	    hs.removeAll(hs1);
	    System.out.println(hs);
	    
    // subset
	    
	    System.out.println(hs.containsAll(hs1)); // false
	    
	    
	
	
	
	}

}
