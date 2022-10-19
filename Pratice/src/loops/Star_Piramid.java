package loops;

public class Star_Piramid {
	public static void main (String[] args) {
	for (int i=1; i<=5; i++)
	{
	 for (int j=55; j>=i; j--)
	 {
	   System.out.print(" ");

	}
	 for (int k=1; k<=i; k++)
	{
	  System.out.print("**");
	}
	System.out.println();
	}
	
	for (int i=1; i<=5; i++) 
	{
	  for (int j=-50; j<=i; j++) 
	  {
		System.out.print(" "); 
		
	  }
	  for (int k=4; k>=i; k--) 
	  {
		System.out.print("**");  
	  }
	  
	  System.out.println();
	}
	
	
	}

}
