package Collection_List;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_2 {

	public static void main(String[] args) {

		ArrayList AL = new ArrayList();
		
		AL.add("D");
		AL.add("A");
		AL.add("C");		
		AL.add("B");
		
		System.out.println(AL);
	//	AL.removeAll(AL);
	//	AL.addAll(AL);
	//	System.out.println(AL);
	//	System.out.println(AL);
        
		ArrayList duplicate = new ArrayList();
		
	//  1) add all 
		duplicate.addAll(AL);
		System.out.println(duplicate);
		
	//  2) remove all 
		duplicate.removeAll(AL);
		
		System.out.println("After Removing :"+ duplicate);
	//  3) isEmpty
		System.out.println(duplicate.isEmpty());
		System.out.println();
		
	// 	Collection method(=======================================)
		System.out.println("Element in Arraylist :"+ AL);
		Collections.sort(AL);
		
		System.out.println("After sorting :" + AL);
		
        Collections.sort(AL,Collections.reverseOrder());		
		
        System.out.println("Elemet in Arraylist after reverse order :"+ AL);

        Collections.shuffle(AL);
        System.out.println("Element in Arraylist after Shuffle :" +AL);
        
    }

}
