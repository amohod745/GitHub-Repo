package Methods;

public class Method5 { 
	//  non static regular method calling from same class
	
	public static void main (String[] args) {
		
		System.out.println("Main Method Started");
		
	// 	Direct calling by Method name
	//	 m1();
    //	 m2();
	//	Calling by Class Name
		
	//	Method5.m1();
	//	Method5.m2();
		
		
	   // Object Creation
	   // syntax == ClassReferancevariablrname = new Classname();
		
		Method5 obj = new Method5();
		        obj.m1();
		        obj.m2();
		        obj.m3();
		        
		        
	// Interview Question //
	// Can i access static method by using obj reference ?	- YES 
	// We can access static method but it will give one warning message.
		        
		System.out.println("Mian Method Ended");
		
		        
	}
	
	public static void m1() {
		
		System.out.println("Non-Static Regular Method Calling From Same Class :m1");
	}
	public static void m2() {
		
		System.out.println("Non-Static Regular Method Calling From Same CLass :m2");
	}
	public static void m3() {
		System.out.println("Static Method");
	}

}
