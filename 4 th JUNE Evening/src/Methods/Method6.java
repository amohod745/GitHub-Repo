package Methods;

public class Method6 {
	
	public static void main (String[] args) {
	
	// Non static method calling from same class //
	// We need to create fist objective of class //
		
	// After create the object the copy of all the non static method will be given to the object.
		
		  Method6 Velocity = new Method6();
		  
		  Velocity.nonstaticmethod1();
		  Velocity.nonstaticmethod2();
		
}



public void nonstaticmethod1(){
	
	System.out.println("Hello Java");
}

public void nonstaticmethod2(){
	System.out.println("How you doning ?");

}
}