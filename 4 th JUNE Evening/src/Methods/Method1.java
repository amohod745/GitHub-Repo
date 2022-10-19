package Methods;

public class Method1 {  // class body 
	
//	static regular method call from same class   //
	
	public static void main (String[] args) // Main method body 
	{  //  starting point of program //		
		System.out.println("Main method started");
		
		
		//1. Direct calling 
		// Syntax = Methodname();
		System.out.println("//1, Direct calling");
		      m1();
		      m2();
		      
		      System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		      
		// 2. Calling by classname
		// Syntax = Classname.methodname();      
		System.out.println("//2. Calling by Class Name");    
		     Method1.m1();
		     Method1.m2();
		     
		     
		System.out.println("Main Method Ended");     
		
	}
	

	    public static void m1() 
	{
		System.out.println("Static method is running from the same class :m1");
		
	}

        public static void m2() {
	  
	    System.out.println("Static method is running from the same class :m2");
	  }
}

