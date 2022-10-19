package Methods;

public class Method2 { // Main Method Body //
	
	public static void main (String [] args) 
	{
	    System.out.println("Main Method Started");
	    
	    System.out.println();
	    
	    
	    System.out.println("Direct Calling By Method Name");
	    
	    // 1. Direct Calling by Method Name
	    System.out.println();
	      staticmethod1();
	      staticmethod2();
	      
	    System.out.println();	      
	    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	    System.out.println();
	    
	   // 2. Calling by Class name
       //    syntax = Classname.methodname();
	    
	    System.out.println("Calling By Class Name");
	    
	    System.out.println();
	    
	      
	      Method2.staticmethod1();
	      Method2.staticmethod2();
	      
	      System.out.println();
	      System.out.println("Main Method Ended");
	
	}
	public static void staticmethod1 ()
	{
		System.out.println("Static Method Calling From Same Class :SM1");
	}
	
	public static void staticmethod2 () 
	{
	
		System.out.println("Static Method Calling From Same Class :SM2");
		
		
	}
	

}

