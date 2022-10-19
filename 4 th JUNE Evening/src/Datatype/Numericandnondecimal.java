package Datatype;

public class Numericandnondecimal {
	// 
	
	public static void main (String[] args)
	{
		
	System.out.println("Tpyes of Datatype");
		
		// 1. primitive data type
		
		//  1). byte data type = -128 to 127 //
		//    syntax = data type = information
		 
		byte b  = 78;
		byte b1 = 127;
		
		//   byte b2 = 135;  // not allowed
		
		System.out.println("byte data : "+b);
		System.out.println("byte data type max limit : "+b1);
		
		byte b2 =  -81;
		byte b3	=  -128;
		//  byte b4 = -245;  // not allowed 
		
		System.out.println("byte data : "+b2);
		System.out.println("byte data type min limit : "+b3);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
	
		//  2). short data type = -32768 to 32767 //
		// syntax = short data type 

		short s  = 15780;
		short s1 = 32767;
	//	short s2 = 35024; // not allowed 
		
		System.out.println("short data type : "+s);
		System.out.println("short data type max limit : "+s1);
		
		
		short s2 =  -24561;
		short s3 =  -32768;
	// 	short s4 = -36482; // not allowed

		System.out.println("short data type : "+s2);
		System.out.println("short dtat type min limit : "+s3);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		// 3. Integer Data type = 4 byte = 32 bit 
		
		int  I  = 100;
		int  I2 = 95642;
		int  I3 = 2147483647; // max limit 
	//	int  I4 = 8956234141; // not allowed
		
		int  I5 = -986425;
		int  I6 = -2147483648; // min limit
	// 	int  I7 = -2147483649; not allowed 
		
		System.out.println("Integer DT :"+I);
		System.out.println("Integer DT :"+I2);
		System.out.println("Integer DT :"+I3);
		System.out.println("Integer DT :"+I5);
		System.out.println("Integer DT :"+I6);
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		// 4. float data type = 4 byte = 32 bit 
		
		float  f  = 33.485f;
		float  f1 = 455.876f;
		float  f2 = 44f;
		float  f3 = 9875.554f;
		
		System.out.println("float DT :"+f);
		System.out.println("float DT :"+f1);
		System.out.println("float DT :"+f2);
		System.out.println("float DT :"+f3);
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		// 5. long data type = 8 byte = 64 bit
		
		
		long L  = -455415544l;
		long L1 = 44552222l;
		long L2 = 7875748967l;
		
		System.out.println("Long DT :"+L);
		System.out.println("Long DT :"+L1);	
		System.out.println("Long DT :"+L2);
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		
		
		// 6. double data type = 8 byte = 64 bit 
		
		double  d  = 58.365;
		double  d1 = 45484.6553d;
		double  d2 = -445235.54;
		double  d3 = -6686d;
		
		System.out.println("double DT :"+d);
		System.out.println("double DT :"+d1);
		System.out.println("double DT :"+d2);
		System.out.println("double DT :"+d3);
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		
		// 7. Character data type = 2 byte = 16 bit
		
		char  c  = 'A';
		char  c1 = 'Z';
		char  c2 = '%';
		char  c3 = '@';
		char  c4 = '#';
	 // Char  c5 ='#@'; // not allowed 
		
		System.out.println("Char DT :"+ c);
		System.out.println("Char DT :"+ c1);
		System.out.println("Char DT :"+ c2);
		System.out.println("Char DT :"+ c3);
		System.out.println("Char DT :"+ c4);
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		
	// conditional data type 
		
		// 8. Boolean data type = 1 bit 
		
		boolean B  = true;
		boolean B1 = false;
	//	boolean B3 = True; not allowed
		
		System.out.println("Boolean DT :"+B);
		System.out.println("Boolean DT :"+ B1);
		
		
		
		
		
		
		
	}

}
