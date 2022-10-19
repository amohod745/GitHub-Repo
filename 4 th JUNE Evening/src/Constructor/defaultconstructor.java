package Constructor;

public class defaultconstructor {
String name;
int rollno;

public defaultconstructor(){
System.out.println("Default Constructor ");

}

public static void main (String [] args){

defaultconstructor d = new defaultconstructor ();
defaultconstructor d1 =  new defaultconstructor ();
d.m1();
}

public void m1 (){
System.out.println("Default method");

}

}

