package Polymorphism;

public class Sample1 {

	public static void main(String[] args) {
		
		Sample1 s1 = new Sample1();
		System.out.println("Hello World");
		s1.demo();
		s1.m1();
		
		

	}
	
	public void m1() {
		System.out.println("Non-Static Method");
	}
	public void demo() {
		int i=12;
		int j=6;
		int a=i/j;
		System.out.println(a);
	}

}
