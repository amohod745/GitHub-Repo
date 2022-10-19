package Logical_Programs;

public class Reverse_A_String {

	public static void main(String[] args) {

		String name = "Akshay";
		int legnth = name.length();
		String rev ="";
		System.out.println("lenght :" +legnth);
		for(int i=legnth-1; i>=0; i--) 
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("reverse of name :" +rev);
	}

}
