package Interface;

public class HSBCBank implements RBIBank , Bank_Of_Russia , USBank{

	public void personalloan() {
		System.out.println("Personal loan  --   HSBC Bank upto 25 lakhs");
	}
	public void matualfund() {
		System.out.println("Matual Fund BY HSBC Bank returns upto 22% pr annum");
	}
	@Override
	public void Credit() {
        System.out.println("Credit -- RBIBank");		
	}
	@Override
	public void Debit() {
        System.out.println("Debit  --  RBIBank");		
	}
	@Override
	public void Moneytransfer() {
        System.out.println("Moneytransfer  --  RBIBank");		
	}
	@Override
	public void carloan() {
        System.out.println("Car loan  --  Bank of Russia ");		
	}
	@Override
	public void goldloan() {
        System.out.println("Gold loan  --  Bank of Russia");		
	}
	@Override
	public void Homeloan() {
        System.out.println("Home loan  --  USBank");		
	}
	@Override
	public void educationloan() {
        System.out.println("Education loan  --  USBank");	
	}
	
}
