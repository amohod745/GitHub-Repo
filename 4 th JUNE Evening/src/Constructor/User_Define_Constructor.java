package Constructor;

public class User_Define_Constructor {
	
	  String name;
	  String model;
	  int    price;
	  String engine;
	  
	  public User_Define_Constructor (String name1, String model1, int price1, String engine1) {
		   name   = name1;
		   model  = model1;
		   price  = price1;
		   engine = engine1;
	  }
	 
	 public static void main (String[] args) {
		 User_Define_Constructor UD1 = new User_Define_Constructor("Kai","Seltos",1780000,"automatic");
		 User_Define_Constructor UD2 = new User_Define_Constructor("TATA", "Punch", 9500000,"Manual");
		 User_Define_Constructor UD3 = new User_Define_Constructor("TATA","Harier",2500000,"automatic");
		 User_Define_Constructor UD4 = new User_Define_Constructor("Honda","City",2000000,"Manual");
		 
		 

	     System.out.println(UD1.name+" "+UD1.model+" "+UD1.price+" "+UD1.engine);
	     System.out.println(UD2.name+" "+UD2.model+" "+UD2.price+" "+UD2.engine);
	     System.out.println(UD3.name+" "+UD3.model+" "+UD3.price+" "+UD3.engine);
	     System.out.println(UD4.name+" "+UD4.model+" "+UD4.price+" "+UD4.engine);
	     
	 }
}
	
	
	
	
	
	
	
	
	
	
