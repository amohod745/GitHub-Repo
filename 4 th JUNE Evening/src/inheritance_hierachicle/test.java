package inheritance_hierachicle;

public class test {
public static void main (String[] args) {
	son1 s1 = new son1 ();
	s1.bike();
	s1.property();
	System.out.println();
	
	son2 s2 = new son2 ();
	s2.mobile();
	s2.property();
	System.out.println();
	
	son3 s3 = new son3();
	s3.laptpo();
	s3.property();
	System.out.println();
	System.out.println("Hierachicle inheritance");

}
}
