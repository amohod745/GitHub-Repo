package Collection_List;

import java.util.HashSet;

public class Hash_set2 {

	public static void main(String[] args) {

		HashSet<Integer> HS = new HashSet<Integer>(); // homo
		
		HS.add(33);
		HS.add(34);
		HS.add(55);
		HS.add(43);
		HS.add(34);
		HS.add(55);
		HS.add(1);
		// duplicates are not allowed in HashSet
		System.out.println(HS);
		
		HashSet<Integer> HS1 = new HashSet<Integer>(); // homo

		// add all
        HS1.addAll(HS);
        System.out.println(HS1);
        
        //remove all
        HS1.removeAll(HS);
        System.out.println(HS1);
        
        
		
	}

}
