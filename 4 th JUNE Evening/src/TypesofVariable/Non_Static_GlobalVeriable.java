package TypesofVariable;

public class Non_Static_GlobalVeriable {
	
	static int i = 25;
	String s = "Akshay";
    int a = 78;

	public static void main(String[] args) {
		 
		Non_Static_GlobalVeriable NV1 = new Non_Static_GlobalVeriable();
        System.out.println(NV1.i);
        System.out.println(NV1.s);
        System.out.println(NV1.a);
        System.out.println();
        m1();
        System.out.println();
        Non_Static_GlobalVeriable.m1();
        System.out.println();
        
        Non_Static_GlobalVeriable NSGV = new Non_Static_GlobalVeriable();
        NSGV.m2();
        
        
        
        
	}
	
	public static void m1() {
		Non_Static_GlobalVeriable NV = new Non_Static_GlobalVeriable();
		System.out.println(NV.i);
		System.out.println(NV.s);
		System.out.println(NV.a);
		
	}
	public void m2 () {
		int d=47;
		String S2 = "virat";
		System.out.println(d);
		System.out.println(S2);
	}

}
