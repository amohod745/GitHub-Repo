package TypesofVariable;

public class Static_Global_variable1Sameclass{

	static String name = "AKSHAY";
	static int age = 25;
	
	public static void main(String[] args) {
		
		System.out.println(Static_Global_variable1Sameclass.name); // calling by class name
		System.out.println(Static_Global_variable1Sameclass.age);// calling by class name
	    System.out.println(name); // Direct calling
	    System.out.println(age);  // Direct calling
	    System.out.println();
	    
	    Static_Global_variable1Sameclass SGV = new Static_Global_variable1Sameclass();
	    SGV.m1();
	    SGV.m2();
	    Static_Global_variable1Sameclass.m3();//calling by class name
	    System.out.println();
	    m3(); // direct calling
	}
	public void m1() {
		System.out.println(name);
		System.out.println(age);
		System.out.println();
		
	}
	public void m2() {
		System.out.println(name);
		System.out.println(age);
		System.out.println();
	}
	public static void m3() {
		System.out.println(name);
		System.out.println(age);
	}

}
