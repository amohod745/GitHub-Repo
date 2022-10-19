package Abstraction;

public class HDFCBank extends RBIBank {
	
	
	public void loan() {
		System.out.println("HDFC  -- Loan");
	}
	public void MatualFund(){
		System.out.println("HDFC  --  Matual Fund");
	}
	public static void main(String[] args) {
		 
	 //  	RBIBank RB = new RBIBank();
		
		HDFCBank HB = new HDFCBank();
		HB.loan();
		HB.MatualFund();
		HB.credit();
		HB.debit();
		HB.PersonalLOAN();
		HB.Locker();
           
	}
	@Override
	public void PersonalLOAN(){
       System.out.println("RBIBank  --  personalloan");
	}
	@Override
	public void Locker() {
     System.out.println("RBIBAnk  --  locker");
	}
	
	

}
