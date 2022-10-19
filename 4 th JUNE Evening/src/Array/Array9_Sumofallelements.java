package Array;

public class Array9_Sumofallelements {

	public static void main(String[] args) {

		int arr[] = {14,02,56,36,11,18,25};
		
		System.out.println(arr.length);
		
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			
			sum = sum + arr[i];
			
		}
		System.out.println("Sum of all elements :"+ sum);
	}

}
