package Logical_Programs;

public class Prime_Number {

	public static void main(String[] args) {

		int no=25;
		int temp=0;
		
		for(int i=2; i<=no-1; i++)
		{
			if(no%i==0)// condition for check reminder is 0 or not 
				//if reminder is 0 than it will enter into if statement 
			{                                                       
				temp=temp+1; // if temp=1 than number is not prime
			}
		}
		if(temp>0)// to check number is prime or not
		{
		   System.out.println("number is not prime :"+no);
		}
		else {
			System.out.println("number is prime :" +no);
		}
	}

}
