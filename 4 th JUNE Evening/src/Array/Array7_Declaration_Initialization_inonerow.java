package Array;

import java.util.Arrays;

public class Array7_Declaration_Initialization_inonerow {

	public static void main(String[] args) {
 
		// declaration & Initialization in one row
		
		int arr [] = {14,45,78,32,01,25,56,46,79}; // declaration & Initialization in one row
		
		System.out.println(arr.length);
		
		System.out.println();
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
