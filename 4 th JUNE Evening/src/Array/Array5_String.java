package Array;

import java.util.Arrays;

public class Array5_String {

	public static void main(String[] args) {
         
		String S [] = new String [5]; // declaration
		
		S[0] = "Aakash";		// initalization
		S[1] = "Akshay";
		S[2] = "Avinash";
		S[3] = "Dhiraj";
		S[4] = "Viral";
		
		System.out.println(S.length);
		
		System.out.println(S[3]);
		
		System.out.println(S[0]);
		
        Arrays.sort(S);
        
        System.out.println();
        
        for (int i=0; i<S.length; i++) {
        	System.out.println(S[i]);
        }
		
		
		
	}

}
