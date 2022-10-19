package Array;

public class additionoftwoaaray {

	public static void main(String[] args) {
		 
		int [] a = {25,45,96,78};
		
		int [] b = {40,23,67,82};
		
		int [] sum = new int [4];
		
		System.out.print("Sum of array");
		System.out.print(" : ");
		for (int i=0; i<a.length; i++) {
			
			sum [i] = a[i] + b [i];
		 
			System.out.print(sum[i] + " ");
			
			
		
		}
		

	}

}
