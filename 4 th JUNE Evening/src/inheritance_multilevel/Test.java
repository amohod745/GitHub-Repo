package inheritance_multilevel;

public class Test {

	public static void main(String[] args) {

		whatsaap_v1 v1 = new whatsaap_v1();
		v1.Textmgs();
		System.out.println();
		whatsaap_v2 v2 = new whatsaap_v2();
		v2.voicecalling();
		v2.Textmgs();
		System.out.println();
		whatsaap_v3 v3 = new whatsaap_v3();
		v3.videocalling();
		v3.voicecalling();
		v3.Textmgs();
		System.out.println();
		whatsaap_v4 v4 = new whatsaap_v4();
		v4.payment();
		v4.videocalling();
		v4.voicecalling();
		v4.Textmgs();
	}

}
