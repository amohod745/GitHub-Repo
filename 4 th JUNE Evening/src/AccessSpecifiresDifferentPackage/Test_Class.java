package AccessSpecifiresDifferentPackage;
import AccessSpecifires.Sample1;
import AccessSpecifires.Sample2;
import AccessSpecifires.Sample4;
import AccessSpecifires.sample3;
public class Test_Class extends Sample4  {
	 
	public int a= 25;

	public static void main(String[] args) {
		Sample1 s1 = new Sample1();
		System.out.println(s1.no);
		System.out.println(s1.name);
		s1.name();
		
		System.out.println();
		
	//	Sample2 s2 = new Sample2();
	//	System.out.println(s2.number);
	//	s2.demo();
		
		System.out.println();
		
	//	sample3 s3 = new sample3();
	//	System.out.println(s3.roll);
	//	s3.m1();
		
		System.out.println();
		
	//	Sample4 s4 = new Sample4();
    //	System.out.println(s4.rollnumber);
    //	s4.m2();
		
		
		
		
		
		
		
		Test_Class T1 = new Test_Class ();
		System.out.println(T1.a);
		T1.M1();
	}
	public void M1 () {
		System.out.println("Test Class Method");
	}

}
