package Generalization;

public class Test_Class {

	public static void main(String[] args) {
         Airtel A = new Airtel();
         A.SMS();
         A.VoiceCalling();
         A.internet();
         A.Hotstar();
         System.out.println("");
	
	     Jio J = new Jio();
	     J.SMS();
	     J.VoiceCalling();
	     J.internet();
	     J.AmazonePrime();
	     System.out.println("");
	     
	     BSNL B = new BSNL();
	     B.SMS();
	     B.VoiceCalling();
	     B.internet();
	     B.NetFilx();
	
	
	}

}
