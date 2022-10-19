package Methods;

public class Method11 {
	
	public static void main (String[] args) {
	
		// Static method with parameter//
		
		addition(78, 752);
		Method11.addition(450, 145);
		
		System.out.println("***************************************************");
		
		substraction(450, 120);
		Method11.substraction(550, 150);
		
		System.out.println("***************************************************");

		multiplication (45, 63);
		Method11.multiplication(78, 45);
		
		System.out.println("***************************************************");

		division(79, 32);
		Method11.division(28, 79);
		
		System.out.println("***************************************************");

		AAA (478,462, 820);
		Method11.AAA(780, 245, 145);
		
	}

	public static void addition (int A, int B) {
		
		int C = A+B;
		System.out.println("addition of two numbers :"+C);
	}
	public static void substraction (int X, int Y) {
		int Z =X-Y;
		System.out.println("substraction of two numbers :"+Z);
	}
	public static void multiplication (int R, int S ) {
		int Q = R*S;
		System.out.println("multiplication of two numbers :"+Q);
    }
	public static void division (float a, float b) {
		float c = a/b;
		System.out.println("division of two numbers :"+c);
	}
	public static void AAA (int t, int s, int w) {
		int o = t+s-w;
		System.out.println("more than one operation :"+o);
	}
		
		
	}

