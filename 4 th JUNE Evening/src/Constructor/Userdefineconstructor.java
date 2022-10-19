package Constructor ;


public class Userdefineconstructor {

     String name;
     String model;
     int    price;
     String enginetype;

public Userdefineconstructor(String name1, String model1, int price1, String enginetype1)
{
    
    name = name1;
    model = model1;
    price = price1;
    enginetype = enginetype1;
}

public static void main (String [] args){
	
    Userdefineconstructor m1 = new Userdefineconstructor("Hundai","I20 2022",1256000,"Automatic");
    Userdefineconstructor m2 = new Userdefineconstructor("TATA","SAFARI 2022",1800000,"Automatic");
    Userdefineconstructor m3 = new Userdefineconstructor("Kai","Seltos",1400000,"Manual");
    Userdefineconstructor m4 = new Userdefineconstructor("Maruti","VITARA BREZZA",1150000,"Manual");

    System.out.println(m1.name+" "+m1.model+" "+m1.price+" "+m1.enginetype);
    System.out.println(m2.name+" "+m2.model+" "+m2.price+" "+m2.enginetype);
    System.out.println(m3.name+" "+m3.model+" "+m3.price+" "+m3.enginetype);
    System.out.println(m4.name+" "+m4.model+" "+m4.price+" "+m4.enginetype);
    
}
}