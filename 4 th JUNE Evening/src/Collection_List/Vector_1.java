package Collection_List;

import java.util.Iterator;
import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {

		Vector <Integer> VC = new Vector<Integer>();
		
		VC.add(2);
		VC.add(3);
		VC.add(4);
		VC.add(3);
		VC.add(10);
		VC.add(9);
		VC.add(5);
		VC.add(14);
		VC.add(13);
		VC.add(25);
		
		System.out.println(VC); // print element
		
		System.out.println(VC.size()); // Returns the number of components in this vector
		
		System.out.println(VC.get(6)); // Returns the element at the specified position in this Vector.
		
		// remove ==> Removes the element at the specified position in this Vector.
		
		VC.remove(6);
		System.out.println(VC);
		
		// add ==> Inserts the specified element at the specified position in this Vector.
		
		VC.add(6, 5);
		System.out.println(VC);
		
		// set ---> Replaces the element at the specified position in this Vector with thespecified element.
		
		VC.set(6, 55);
		System.out.println(VC);
		
		//reading element
		System.out.println();
		System.out.println("reading element by using for loop");
		
		for (int i=0; i<VC.size(); i++) {
			
			System.out.println(VC.get(i));
			
		}
		System.out.println();
		System.out.println("reading element by using for each loop/advance loop");
		for(Object obj : VC) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("reading element by using Iterator");
        
		Iterator obj = VC.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		

		

		
		
	}

}
