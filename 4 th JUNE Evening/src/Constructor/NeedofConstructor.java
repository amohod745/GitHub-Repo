package Constructor;

public class NeedofConstructor {
	String name;
	int rollno;
	
	public NeedofConstructor() {
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		
		NeedofConstructor S1 = new NeedofConstructor();
		NeedofConstructor S2 = new NeedofConstructor();
		//___
        //___ 
		NeedofConstructor S11 = new NeedofConstructor();
		NeedofConstructor S12 = new NeedofConstructor();
		//___
		//___
		NeedofConstructor S100 = new NeedofConstructor ();
		S1.m1();
		S12.m1();
		S100.m1();
		
		NeedofConstructor se = new NeedofConstructor();
		se.m1();
	}
	public void m1 () {
		System.out.println(name+" "+rollno);
		
	}

}

// ** Need/ purpose of constructor
//1).  once we create an object compulsory we required to performed initialization
//     for that object
//2).  the constructor is specially designed to perform initialization of object
//3).  Constructor is special type of method which is used to initialization of object
//4).  Every time an object is created using new keyword at least one constructor is  called
