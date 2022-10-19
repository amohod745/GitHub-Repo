package Polymorphism;

public class Automatic_Promotion {
	
	public void m1 () {
		System.out.println("Zero i/p para method");
	}
	public void m1 (int i) {
		System.out.println("float i/p para method");
	}
	public void m1 (double d) {
		System.out.println("double i/p para method");
	}
	
	public static void main(String[] args) {
            
		Automatic_Promotion AP = new Automatic_Promotion ();
		AP.m1();
	    AP.m1(72);
	    AP.m1(12d);
	    
		
	}
	

}
