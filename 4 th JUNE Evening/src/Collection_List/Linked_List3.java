package Collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Linked_List3 {

	public static void main(String[] args) {

		LinkedList <String> LL = new LinkedList<String>();
		// convert arraylis into linkedlist (for this we are using addall();) method
		ArrayList AL = new ArrayList();
		AL.add(2);
		AL.add(25.46);
		AL.add("Java");
		AL.add('A');
		System.out.println("Before converting :its a declare as Arraylist :" +AL);

		LinkedList  LL1 = new LinkedList();
		LL1.addAll(AL);

		System.out.println("After converting : its convert into Linkedlist :" +LL1);
		System.out.println();
		
		// convert array into arraylist (for this we are using Arrays.aslist();) method
		
        String [] arr = {"AKSHAY", "ANNARAO", "MOHOD"};
		
		for(String name : arr ) {
			System.out.print(" "+ name);
		}
		System.out.println();
		
		// convert array into arraylist
	
		ArrayList AL1 = new ArrayList(Arrays.asList(arr));
		System.out.println(AL1);
		
//		LL.add("Akshay");
//		LL.add("Pratham");
//		LL.add("Dhiraj");
//		LL.add("Vriti");
//		LL.add("Pratham");
//		
//		LL.add("MOM");
//		System.out.println(LL);
//		
//		//add first
//		LL.addFirst("Family");
//		System.out.println(LL);
//		
//		// add last
//		LL.addLast("World");
//		System.out.println(LL);
//		
		
	}

}
