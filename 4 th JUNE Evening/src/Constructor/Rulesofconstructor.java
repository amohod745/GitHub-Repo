package Constructor;

public class Rulesofconstructor {
	/*1. Name of the constructor is must be same as class name	
	
	 public RulesofConstructor() {
	   
	   System.out.println("Default Constructor");
  }
  
  2.We Can not create constructor inside the method/block/function
	
		public RulesofConstructor() {
			System.out.println("Default const");
			
 3. Return type concept is not applicable for constructor even void aslo.
 if u take void keyword that time compiler will treated as method
 public void RulesofConstructor() {   // Not allowed
		System.out.println("Default const");
	}  
 
 
 4.Applicable modifiers/keyword
 Applicable  - public, private , protected , default
 Not applicable - final, static, abstract, native
 
 5.Any number of constructor can be declared in java class but constructor name
 should be same as class name but argument/parameters should be different
	*/
	
   public Rulesofconstructor() {
	  System.out.println("Zero input constructor");
 }
   public Rulesofconstructor(int i ) {
   	System.out.println(i);
 	  System.out.println("one input para cons ");
   }
   public Rulesofconstructor(int i ,int j) {
 	  System.out.println("Two input para const ");
 	  System.out.println(i+" "+j);
   }
   
   public Rulesofconstructor(String name, int rollno) {
 	  System.out.println("Two input param constructor");
 	  System.out.println(name+" "+rollno);
 	  
   }
   
      
	public static void main(String[] args) {
		Rulesofconstructor s4 =new Rulesofconstructor();
		Rulesofconstructor s1 =new Rulesofconstructor(10);
		Rulesofconstructor s2 =new Rulesofconstructor(23,40);
		Rulesofconstructor s = new Rulesofconstructor("Rahul",20);
		
		
}
}