package Methods;

public class Method4 {
	
	// Different Class -- Another Class
		public static void main (String[]args) {
			
			System.out.println("Main Method Started");
			
			
		//	demo1(); -- direct calling by method name is not allowed
			
	    // Calling By Class name
			
			// Syntax == Classname.method();
			
			 Method3.demo1();
			 Method3.demo2();
			 Method4.demo3();
			 Method2.staticmethod1();
			 Method2.staticmethod2();
			 
			 
		  System.out.println("Main Method Ended");	  
			 
	

			
			
		}public static void demo3() {
	System.out.println("HI How are you buddy ?");
	
	
}
	
}
