package Logical_Programs;

public class Print_PrimeNumber_1to100 {

	public static void main(String[] args) {

		
		for(int i=1;i<=100; i++) 
		{
		int temp=0;
		for(int j=2; j<=i-1; j++)
		{
		    if(i%j==0) 
		    {
				temp=temp+1; // this condition makes temp>0 
			}
		}
		    if(temp==0) // check temp is 0 than number is prime
		   {
			System.out.println(i);
	       }
		   else {
			temp=0;
		   }
	    }
   }
}
