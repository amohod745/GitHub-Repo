package Collection_List;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set1 {

	public static void main(String[] args) { // index order is persevred

		HashSet HS = new HashSet(); // defalute capacity = 16 and load factor = 0.75
		
		HashSet HS2 = new HashSet(200, (float) 0.85); // if u want to change load factor
		
		HashSet <String> HS3 = new HashSet<String>(); // homo type
		
		HS.add(200);
		HS.add("JAVA");
		HS.add(253.45);
		HS.add(null);
		HS.add(true);
		HS.add(null);
		HS.add(false);
		HS.add('A');
		
		System.out.println(HS);
		
		HS.add("Python"); // add an element at last index
		System.out.println(HS);
		
		System.out.println(HS.add("JAVA"));
		// if you are trying to add duplicate element then it will returns false
		//if the element is not present in hashset that time it will returen true
		System.out.println(HS.add("java"));
		
		// Remove --> Removes the specified element from this set if it is present.
		HS.remove('A');
		System.out.println(HS);
		
		// Set method is not present in HashSet
		
		// Contains
		
		System.out.println(HS.contains("Python"));
		System.out.println(HS.contains("Jaa"));
		
		// isEmpty
		
		System.out.println(HS.isEmpty());
		System.out.println(HS2.isEmpty());
		
		System.out.println();
		
	//	for (int i=0; i<HS.size(); i++) { not allowed becuse get method is not present in HashSet
	//		System.out.println(HS.get(i));
		System.out.println("Reading element by using foreach loop");
		for(Object obj : HS) {
			System.out.println(obj);
    	}
		System.out.println();
		
		System.out.println("Reading elemetn by using iterator");
		Iterator it = HS.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
   }

}
