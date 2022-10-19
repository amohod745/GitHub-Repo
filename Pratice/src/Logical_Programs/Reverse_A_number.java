package Logical_Programs;

public class Reverse_A_number {

	public static void main(String[] args) {

		int number = 784635;
		int reminder;
		int reverse=0;
		
		while(number!=0)
		{
			reminder = number%10; //5   //53
	//		System.out.println(reminder);
			reverse = reverse*10 + reminder;//  // 
	//		System.out.println(reverse);
			number = number/10;//78463
	//		System.out.println(number);
		}
		System.out.println("reverse a number :" +reverse);
	}

}
