package Logical_Programs;

public class swapnumber_with_thiredvaribale {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		int c=a; // c=a --> c=10
		a=b;     // a=b --> 10=20 --> a=20
		b=c;     // b=c --> 20=10 --> b=10
		
		System.out.println("a is :" +a);
		System.out.println("b is :" +b);
	}

}
