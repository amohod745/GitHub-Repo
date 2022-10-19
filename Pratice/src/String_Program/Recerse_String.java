package String_Program;

public class Recerse_String{

	public static void main(String[] args) {
      
      //    index value of string stars from 0
		
	  //	         0 1 2 3 4 5
	  String name = "A K S H A Y";// string reverse index will be print 
      
	  System.out.println("name : " +name);
	  
	  int leng=name.length();// length() using for counting the numbers of letters
	  
      System.out.println("Numbers of Char in Name : " + name.length());
      
      String rev="";
      //            6-1; 6>=0;  5
      //            5-1; 4>=0;  3
      
      for (int i=leng-1; i>=0; i--) 
      {
    	  rev=rev+name.charAt(i);// use to declared location of letter print the index loop
      }
      
      System.out.println("Revsers of name : " + rev);
     
	}
}
