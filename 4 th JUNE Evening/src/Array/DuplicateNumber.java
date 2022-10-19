package Array;

public class DuplicateNumber {

	public static void main(String[] args) {
	
		int a [] = {1,9,3,4,9,7,3,4,2};
		
		System.out.println(a.length);
		System.out.println("Duplicate numbers in given array");
		
		for (int i=0; i<=a.length; i++) {
			
			for (int j=i+1; j<a.length; j++) {
				
				if (a[i]==a[j]) {
					
					System.out.print(a[j]+" " );
				}
			}
		}	
	}
}