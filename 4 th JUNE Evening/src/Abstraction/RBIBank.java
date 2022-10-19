package Abstraction;

public abstract class RBIBank {
	
	public void credit () {
		System.out.println("RBIBank  --  Credit");
	}
	public void debit() {
		System.out.println("RBIBank  --  Debit");
	}
	public abstract void PersonalLOAN();
    public abstract void Locker();
}
