package Array;

import java.util.Arrays;

public class Array2_char {

	public static void main(String[] args) {
            
		// char array
		
		char c [] = new char[8];  // array declaration
		
		c[0] = 'A';    //
		c[1] = '$';
		c[2] = 'c';         // array inialization
		c[3] = '%';
		c[4] = 'e';  //
		c[5] = 'Z';
		c[6] = '&';
		c[7] = '!';
	//	c[8] = 'i';
		System.out.println(c.length);  // use 
		System.out.println();
		
	    Arrays.sort(c);
		
		System.out.println(c[2]);
		System.out.println(c[0]);
		System.out.println(c[5]);
		
		System.out.println();
		
		
		for (int i=0; i<c.length; i++) { // use 
			System.out.println(c[i]);
		}
		
		
		
		
		
	}

}
  