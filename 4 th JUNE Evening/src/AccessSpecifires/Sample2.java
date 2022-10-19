package AccessSpecifires;

public class Sample2 {
	
	private int number = 45200;

	public static void main(String[] args) {

		// if you declare any member of class as private than scope of that members remains only within the class 
		Sample2 s2 = new Sample2();
		System.out.println(s2.number);
		s2.demo();
	}
	
	private void demo() {
		System.out.println("Access Specifires --- private");
	}

}
