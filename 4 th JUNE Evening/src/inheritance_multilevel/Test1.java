package inheritance_multilevel;

public class Test1 {

	public static void main(String[] args) {
     KYCRE1 CR1 = new KYCRE1();
     CR1.IDproof();
     System.out.println();
     
     KYCRE2 CR2 = new KYCRE2();
     CR2.Photos();
     CR2.IDproof();
     System.out.println();
     
     KYCRE3 CR3 = new KYCRE3();
     CR3.Biometric();
     CR3.Photos();
     CR3.IDproof();
     System.out.println();
     
     KYCRE4 CR4 = new KYCRE4();
     CR4.RegisterMobileNumber();
     CR4.Biometric();
     CR4.Photos();
     CR4.IDproof();
     
     
	}

}