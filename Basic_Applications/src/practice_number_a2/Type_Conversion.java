package practice_number_a2;

public class Type_Conversion {
	
	public static void main(String[] args) {
		
		// implicit conversion
		 byte  a =5;
		 int b=a;
		System.out.println(" "+b);
		
		
		
		// Explicit conversion
		
		 int a1 =5;
		 byte b1=(byte)a1;
		System.out.println("" +b);
		
		
		// Explicit conversion 
		 byte a3=5;
		 byte b3=8;
		 byte c=(byte)(a3+b3);   // integer     // byte 1 byte size  // 4 byte 
		System.out.println(" "+c);
		
		
		
		 byte b4=5;
		 byte b5=6;
		 int d= b4+b5;  // integer 
		
	}

}
