package Collection_Queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {

		// insertion order is preserved
		//Duplicates are not allowed
		//We can only stroe homo types of data
		
		PriorityQueue PQ1 = new PriorityQueue();
		
		PriorityQueue PQ = new PriorityQueue();
		
		
		// adding element by using offer method insertion order is preserved 
	//	PQ1.offer("Q");
		PQ1.offer("A");
		PQ1.offer("E");
		PQ1.offer("D");
		PQ1.offer("S");
		PQ1.offer("H");
		PQ1.offer("G");
		PQ1.offer("L");
		PQ1.offer(" ");
		
		// adding element by using add method insertion order is not preserved 

//		PQ1.add("R");
//		PQ1.add("Z");
//		PQ1.add("B");
//		PQ1.add("O");
//		PQ1.add("T");
//		PQ1.add("C");
//		PQ1.add("I");
		
		System.out.println(PQ1);
	//	System.out.println(PQ1.add(100)); //  java.lang.ClassCastException
		
		// 3) element and 4) peak
		
		// element --> if the queue is Empty it will throws >>>>> java.util.NoSuchElementException
//		System.out.println(PQ.element());
		
		// peak --> if the queue is Empty it will throws >>>>> null 
//		System.out.println(PQ.peek());
		
		// 5) Remove and 6) Poll
		
		// Remove --> if the queue is Empty it will throws >>>>> java.util.NoSuchElementException
	//	System.out.println(PQ.remove());
	//	System.out.println(PQ);
		
		//POll --> if the queue is Empty it will throws >>>>> null
	//	System.out.println(PQ.poll());
		
		// reading element 
	//	System.out.println("Reading element by using for each loop");
	//	for (Object obj : PQ1) {
	//		System.out.println(obj);
		}
		
		
		
	}


