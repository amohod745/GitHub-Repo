package Array;

public class Array3_double {

	public static void main(String[] args) {

		double d [] = new double [5];
		
		d[0] = 10d;
		d[1] = 20d;
		d[2] = 30d;
		d[3] = 40d;
		d[4] = 50d;
		
		System.out.println(d[4]);
		
		System.out.println(d.length);
		
		for (int i=0; i<d.length; i++) {
			System.out.println(d[i]+"");
		}
		
	}

}
