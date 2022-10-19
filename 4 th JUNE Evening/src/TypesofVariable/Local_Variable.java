package TypesofVariable;

public class Local_Variable {
	
	 int j = 56; 

	public static void main(String[] args) {
		
		Local_Variable.m1(); // calling by classname
		Local_Variable.m2();
	Local_Variable jj = new Local_Variable();
		System.out.println(jj.j);
	}
	public static void m1() {
		 int i = 25; // u can use this variable only within method body 
	// 	System.out.println(x);
       System.out.println();
		System.out.println(i);

	}
	
	public static void m2() {
		int x= 45; // u can use this variable only within method body
	//	System.out.println(i);
         
		System.out.println(x);
	}
	

}
