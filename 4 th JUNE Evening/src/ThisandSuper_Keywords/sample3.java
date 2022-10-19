package ThisandSuper_Keywords;

public class sample3 extends sample2 {
	int a =07;
	int b = 42;

	public void Test1 (){

	int a= 88;
	int b = 63;
	String X = "Aksahy";

	System.out.println("Local Variable :"+a);
	System.out.println("Local Variable :"+b);
	System.out.println("Local Variable :"+X);
	System.out.println("Global Variable from same class :"+this.a);
	System.out.println("Global Variable from same class :"+this.b);
	System.out.println();
	
	System.out.println("USE of SUPER keyword = First Extends class");
	System.out.println("Global Variable From Different Class :"+super.number);
	System.out.println("Global Variable From Differnet class :"+super.name);
	
	}
	public static void main (String[] args){
		sample3 s3 = new sample3();
		s3.Test1();
		}
	}




