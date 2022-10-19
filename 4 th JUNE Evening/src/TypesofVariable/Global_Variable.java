package TypesofVariable;

public class Global_Variable {
	// Creating variable outside method/block is knows as global variable
    // static global variable call from same class
			

	    static int i = 50;
	    public static void main(String[] args) {
		System.out.println(i); //50
		System.out.println();
		Global_Variable GV = new Global_Variable();
		GV.M1();
		System.out.println();

		System.out.println(i);
		
		System.out.println();
		
		Global_Variable GV1 = new Global_Variable();
		GV1.M2();
	}
	public void  M1() {
		int a = 30; // local variable
		System.out.println(a);
		System.out.println();
		System.out.println(i);
	}
	public void M2() {
		int  v = 75;
		System.out.println(v);
		System.out.println();
		System.out.println(i);
	}

}
