package Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		
		// declaring multipel method with same method name but with different argument in same class 
		// is called as MethodOverloading
		
		
		
		
		MethodOverloading MO = new MethodOverloading();
		MO.m1();
		MO.m1(125);
		MO.m1("Akshay");
		MO.m1(12d);
	}
	public void m1(){
		System.out.println("Non-Static Method Zero Parameter");
	}
	public void m1(int i){ 
		System.out.println("int argument method");
	}
	public void m1(String name) {
		System.out.println("String argument method");
	}
	public void m1(double d) {
		System.out.println("double argument method");
	}

    }
