package Generalization;

public class Airtel implements SimCard{
	public void Hotstar(){
	System.out.println("Airtel -- Hotstar");	
	}

	@Override
	public void SMS() {
          System.out.println("Airtel -- SMS");		
	}

	@Override
	public void VoiceCalling() {
          System.out.println("Airtel -- Voice Calling");		
	}

	@Override
	public void internet() {
          System.out.println("Airtel -- Internet");		
	}
}
