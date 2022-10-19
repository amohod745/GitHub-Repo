package AccessSpecifires;

public class Sample1 {
	
	public int no=10;
	public String name= "akshay";

	public static void main(String[] args) {
     // public accessspecifires
     // if you declare any member of class as public than scope of that members remains througth the project
		
		Sample1 s1 = new Sample1 ();
		System.out.println(s1.no);
		System.out.println(s1.name);
		s1.name();
	}
	public void name() { // non static method 
		System.out.println("Access Specifires --- public");
	}

}
