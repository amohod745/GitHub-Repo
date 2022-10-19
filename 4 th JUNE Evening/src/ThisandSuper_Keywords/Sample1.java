package ThisandSuper_Keywords;

public class Sample1 {
	// what is a use of this keyword ??
	// This keyword is used to access global variable from same class .
	
	int RollNo = 10;
	int RollNo1 = 12;
	
	public void test () {
		int RollNo = 23;
		int RollNo1 = 45;
		
		System.out.println("Local variable :"+RollNo);
        System.out.println("Local variable :"+RollNo1);
        System.out.println("Global Variable :"+RollNo);
        System.out.println("Global Variable :"+RollNo1);
        System.out.println();
        System.out.println();
        System.out.println("Use of THIS keyword");
        System.out.println();
        System.out.println("Global Variable :"+this.RollNo);
        System.out.println("Global Variable :"+this.RollNo1);
	}

	public static void main(String [] args) {
		Sample1 S1 = new Sample1();
		S1.test();
	}
}
