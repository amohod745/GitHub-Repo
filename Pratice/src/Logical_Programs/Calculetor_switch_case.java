package Logical_Programs;

public class Calculetor_switch_case {

	public static void main(String[] args) {

		int a=45;
		int b=15;
		int result;
		
		String symbol ="*";
		
		switch(symbol)
		{
		case "+":  result = a+b;
			System.out.println("addition : " +result);
			break;
		
		case "-": result = a-b;
			System.out.println("substraction : " +result);
			break;
			
		case "*": result = a*b;
			System.out.println("multipelication : " +result);
			break;
			
		case "/": result = a/b;
			System.out.println("division : " +result);
			break;
			
//		case "%": result =a%b;
//		    System.out.println("modulse :"+result);
//			
		default: System.out.println("invalid symbol");
		break;
		}
		
	}

}
