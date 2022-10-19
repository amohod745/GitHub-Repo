package AccessSpecifires;

public class sample3 {
    
	int rollno=125;
	
	public static void main(String[] args) {
		// if you declare any member of class as default than scope of that members remains within the package
		
		sample3 s3 = new sample3 ();
		System.out.println(s3.rollno);
		s3.m1();

	}
	void m1 () {
		System.out.println("Access Specifire --- Default");
	}

}
