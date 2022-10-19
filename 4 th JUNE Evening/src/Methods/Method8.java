package Methods;

public class Method8 {
	
	public static void main (String[] args) {
		
		   Method7 ABC = new Method7();
		   
		           ABC.M1();  //Class = Method7
		           ABC.M2();  //Class = Method7
	// Non static method cloud not create in Same Class without creating A OBJECT //
		         //  M3();  // Class = Method8/Same Class
		           
		   Method8 abc = new Method8();
		           abc.M3(); //Class = Method8/Same Class
	}
	
	public void M3() {
		System.out.println("Non-Static Method From Same Class = Method8");
	}

}
