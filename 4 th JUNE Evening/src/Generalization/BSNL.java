package Generalization;

public class  BSNL implements SimCard {
public void NetFilx() {
	System.out.println("BSNL -- NetFilx");
}

@Override
public void SMS() {
System.out.println("BSNL -- SMS");	
}

@Override
public void VoiceCalling() {
System.out.println("BSNL -- Voice Calling");	
}

@Override
public void internet() {
System.out.println("BSNL -- Internet");	
}
}
