package Collection_List;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_List2 {

	public static void main(String[] args) {

		LinkedList <String> LL = new LinkedList<String>();
		
		LL.add("A");
		LL.add("B");
		LL.add("C");
		LL.add("E");
		LL.add("D");
		
		System.out.println(LL); // print
		
		LinkedList <String> LL1 = new LinkedList<String>();// homo
		
		// addall
		LL1.addAll(LL);   // add all element from LL into LL1 
		System.out.println(LL1);
		
		// remove
		LL1.removeAll(LL);
		System.out.println(LL1);
		
		System.out.println(LL1.isEmpty());
		
		// Collections --> sort
		System.out.println("Before sorting :"+LL);
        Collections.sort(LL);
        System.out.println();
        System.out.println("After sorting :"+LL);
        
        // reverse
        
        Collections.sort(LL, Collections.reverseOrder());
        System.out.println(LL);
        System.out.println();
        
        Collections.shuffle(LL);
        System.out.println(LL);
		
	}

}
