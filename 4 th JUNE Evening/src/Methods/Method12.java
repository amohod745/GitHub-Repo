package Methods;

public class Method12 {
	
	
	// static regular method with parameter //
	
	public static void main (String[] args) {
		
		//Method12.studentinfo(null, 0, 0, 0);
	
	    studentinfo("Akshya", 127, 'A', 98f);
	
	
	}
	public static void studentinfo(String studentname,
			int studentrollnumber,
			char studentgrade,
			float studentpercentage) 
	{
		
	System.out.println("Student Name:"+studentname+" "+"Student RollNumber :"+studentrollnumber+" "+"Student Grade :"+studentgrade+" "+"Student Percentage :"+studentpercentage);
		
	}

}
