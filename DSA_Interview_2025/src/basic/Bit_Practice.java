package basic;

public class Bit_Practice {

	public static void main(String[] args) {

		boolean b = false;

		System.out.println(!b);

		int x = 0;
		int y = ~x; // 0000 // 1111 // 00000+1 = 00001

		System.out.println(y);
		
		
		boolean a1= true;
		boolean b1= true;
		
		System.out.println(a1^b1);
		
		int a2=5;
		int b2=10;
		System.out.println(a2&b2);
	}

}
