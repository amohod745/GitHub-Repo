package Array;

public class Array6_Object_Array {

	public static void main(String[] args) {
         
		Object Obj [] = new Object[6];
		
		Obj [0] = 10;        // int
		Obj [1] = 'A';       // char
		Obj [2] = "Akshay";   // string
		Obj [3] = 75.26d;    // double
		Obj [4] = true;      // booblean
		Obj [5] = null;      // sting default value
		
		System.out.println(Obj.length);
		System.out.println();
		
		for (int i=0; i<Obj.length; i++) {
			
			System.out.print(Obj[i]+" ");
			
		}
	}

}
