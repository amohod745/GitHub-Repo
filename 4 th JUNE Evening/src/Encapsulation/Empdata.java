package Encapsulation;

public class Empdata {
	
	public int PIN;
	public String NAME;
	public int AGE;

	public static void main(String[] args) {
/* Encapsulation in java is a process of wrapping the code and data together into single unit
 * it is also called as data hidding 
 * Variables are always Private in Encapsulation -- getter and setter method are always public in nature
 * Private data members/variables -- we can not access directly from another class
*/	
		Empdata emp = new Empdata();
		emp.setNAME("Akshay Mohod");
		emp.setAGE(26);
		emp.setPIN(6029);
		
		System.out.println("emp name is : " +emp.getNAME());
		System.out.println("emp age is : " +emp.getAGE());
		System.out.println("emp pin is :" +emp.getPIN());
		
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public int getAGE() {
		return AGE;
	}

	public void setAGE(int aGE) {
		AGE = aGE;
	}

}
