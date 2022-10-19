package Encapsulation;

public class DifferentClass {

	public static void main(String[] args) {

		Empdata EMP = new Empdata();
		EMP.setNAME("Vishal Aahire");
		EMP.setAGE(28);
		EMP.setPIN(9962);
		
		System.out.println("emp name is : " +EMP.getNAME());
		System.out.println("emp age is : " + EMP.getAGE());
		System.out.println("emp pin is : " + EMP.getPIN());
		
	}

}
