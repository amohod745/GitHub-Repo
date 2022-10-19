package TypesofVariable;

public class Local_Variable1 {

	public static void main(String[] args) {
       
		int a = 30;
		String s= "rohit";
		System.out.println(a);
		System.out.println(s);
		System.out.println();
		m1();
		System.out.println();
		
		Local_Variable1 lv = new Local_Variable1();
		lv.m2();
	}
	public static void m1() {
	//	System.out.println(a);
	//	System.out.println(s);
		 
		int i =25;
		String s1 = "akshay";
		System.out.println(i);
		System.out.println(s1);
    }
	public void m2() {
		int b = 20;
		int c = 35;
		int f = b+c;
		
		System.out.println(f);
	}

}
