package AccessSpecifires;

public class Sample4 {
	protected int rollnumber = 45;

	public static void main(String[] args) {
     Sample4 s4 = new Sample4();
     System.out.println(s4.rollnumber);
	 s4.m2();
	}
protected void m2 () {
	System.out.println("Aeecss Specifire --- protected");
}
}
