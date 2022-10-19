package AccessSpecifires;

public class DifferentClassSample1 {

	public static void main(String[] args) {
		Sample1 s1 = new Sample1();// public access specifire 
		System.out.println(s1.no);
		s1.name();
		
	//	Sample2 s2 = new Sample2(); // protected AS
	//	s2.demo();
		
		sample3 s3 = new sample3();
		System.out.println(s3.rollno);
		s3.m1();
		
		Sample4 s4 = new Sample4();
		System.out.println(s4.rollnumber);
		s4.m2();
		
		
		
	}

}
