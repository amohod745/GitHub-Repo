package Control_Statement;

public class Nested_IfStatement {

	public static void main(String[] args) {
       
		int a = 700;
		int b = 800;
		int c = 600;
		
		if (a<b&&a<c) {  
		    {
				System.out.println("A is a greates number");
			}
		    }
			else if (b>c) {
				System.out.println("B is a greates number");
			}
			else {
				System.out.println("C is a greates number");
			}
		}
	}

