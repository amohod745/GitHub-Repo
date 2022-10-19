package Array;

public class Secondlargestnumber {

	
		

			public static void main (String [] args){


			int arr [] = {1,2,6,88,65,32,10,78};

			System.out.println(arr.length);

			for (int i=0; i<arr.length; i++)
			{
			  for(int j=i+1; j<arr.length; j++)
			  {

			  if (arr[i]<arr[j]) {
				  
				
				int c=arr[i];
				arr[i]= arr[j];
				arr[j] = c;
				}
			}
			  
			}
			System.out.println("second largest number is : " + arr[1]);

			}
				}


