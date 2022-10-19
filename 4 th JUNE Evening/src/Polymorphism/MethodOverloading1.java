package Polymorphism;

public class MethodOverloading1 {

	public static void main(String[] args) {
		MethodOverloading1 MO1 = new MethodOverloading1();
		MO1.addition(145, 256);
		MO1.addition(456, 210, 780);
		MO1.subtraction(256, 280);
		MO1.m1();
		MO1.demo("Akshay");
	}
	public void addition(int i , int j) {
		int sum = i+j;
		System.out.println(sum);
	}
	public void addition(int i, int j, int k ){
		int sum = i+j-k;
		System.out.println(sum);
	}
	public void subtraction(int i, int j) {
		int sub = i-j;
		System.out.println(sub);
	}
	public void m1() {
		System.out.println("Zero i/p Parameter Method");
	}
	public void demo(String name) {
		System.out.println("one i/p parameter method");
	}
}
