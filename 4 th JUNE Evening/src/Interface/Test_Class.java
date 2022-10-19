package Interface;

public class Test_Class {

	public static void main(String[] args) {
            
		HSBCBank HB = new HSBCBank();
		HB.personalloan();
		HB.matualfund();
		System.out.println("===================================================================");
		HB.Credit();
		HB.Debit();
		HB.Moneytransfer();
		System.out.println("Minimum balance "+HB.minibalance);
		System.out.println("===================================================================");
		HB.carloan();
		HB.goldloan();
		System.out.println("===================================================================");
		HB.Homeloan();
		HB.educationloan();
	}

}
