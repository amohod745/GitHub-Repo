package Collection_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_List_3 {

	public static void main(String[] args) {

		String [] arr = {"AKSHAY", "ANNARAO", "MOHOD"};
		
		for(String name : arr ) {
			System.out.println(" "+ name);
		}
		
		// convert array into arraylist
	
		ArrayList AL = new ArrayList(Arrays.asList(arr));
		System.out.println(AL);
		
		

	}

}
