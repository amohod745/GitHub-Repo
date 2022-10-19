package Array;

import java.util.Arrays;

public class Array8_Reverse_Array {

	public static void main(String[] args) {
    
		int arr [] = {10,7,5,4,3,1,0};
		
		System.out.println(arr.length);
		System.out.println("Original Array");
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println();
		
		System.out.println("Reverse Array");
		
	    for (int j=6; j>=0; j--) {
	    	System.out.print(arr[j]+" ");
	    }
	}
}
