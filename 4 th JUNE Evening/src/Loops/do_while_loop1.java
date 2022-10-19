package Loops;

public class do_while_loop1 {

	public static void main(String[] args) {
    // print 1 to 5 numbers using do_while_loop
		
		// Syntax 
		//initialization 
		// do{
		// code to executed
		// increment/decrement
		//   }
		// while (condition)
	int sum = 0;
	int i=1;
	do {
		sum=sum+i;
		System.out.println(sum);
		i++;

	}
	while(i<=5);
	System.out.println("Done");

	
	}

}
