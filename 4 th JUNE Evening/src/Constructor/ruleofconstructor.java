package Constructor;

public class ruleofconstructor {


public ruleofconstructor(){
System.out.println("Zero input parameter");
}
public ruleofconstructor (int a){
System.out.println("One input parameter");
System.out.println(a);
}
public ruleofconstructor (int i, int j){
System.out.println("Two input parameter");
System.out.println(i+" "+j);
}
public ruleofconstructor(String name, int b){
System.out.println("Two input parameter");
System.out.println(name+" "+b);
}

public static void main (String[] args){

   ruleofconstructor v1 = new ruleofconstructor();
   ruleofconstructor v2 = new ruleofconstructor(25);
   ruleofconstructor v3 = new ruleofconstructor(48,79);
   ruleofconstructor v4 = new ruleofconstructor("Rahul",25);

}
}
