package Methods;

public class Method10 {  // Class body
	
	public static void main (String[] args ) {
		
		// Static method with parameter 
		
		addition(45, 55); // Direct Calling
		Method10.addition(7894, 7946); // Calling by Class Name
		addition(450, 601);
		Method10.addition(485,780);
       
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		substraction (780,986); // Direct Calling
		Method10.substraction(987, 248); // Calling by Class name
		substraction (1465,789);
		Method10.substraction(965, 453);
		
}
public static void addition(int X, int Y) {
	
	   int Z = X+Y;
	   
	System.out.println("Addition of two numbers :"+Z);   
	
}
public static void substraction (int A, int B) {
	 
	  int C = A-B;
	  
	System.out.println("substraction of two numbers :"+C);  
	
}

      

}
