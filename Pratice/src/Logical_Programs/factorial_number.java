package Logical_Programs;

public class factorial_number {

	public static void main(String[] args) {


		int no=9;
		int fact=1;
		
//		for(int i=1; i<=no; i++) 
//		{
//			fact = fact * i; 
//		}
//		System.out.println("factorial number :" +fact);
		
		for(int i=no; i>=1; i--) 
		{
			fact = fact * i; 

		}
		System.out.println("factorial number :" +fact);
	}

}
