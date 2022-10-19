package Array;

public class Array1_int {

	public static void main(String[] args) {
        //	int i1 = 100;
		//  i1 = 125;
		//  i1 = 112;
		//	System.out.println(i1);
		
		// Array Declaration 
		
		int arr [] = new int [10];
		
		// Array inialization
		
		arr[0] = 1; // Array index is always start with 0 th 
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		
		// Array Use
		
		System.out.println(arr[7]);
		System.out.println(arr[4]);
		System.out.println(arr[9]);
		System.out.println();
		
		System.out.println(arr.length);
		System.out.println();
 		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
