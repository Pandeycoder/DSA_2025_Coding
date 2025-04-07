package bit_manipulation;

public class Right_Shift_Left_Shift {

	public static void main(String[] args) {

		bitChek(12, 4);

	}

	public static void bitChek(int a, int b) {

		// Left Shift Operator
		a <<= 1;
		System.out.println(" left shift bit " + a); // 24*2^1 =24
		a <<= 2;
		System.out.println(" left shift bit " + a); // 24*2^2 = 96

		b <<= -1;
		System.out.println(" Right Shift bit " + b); // 0000100 // 1000000100 // 10000010 //-2

		// Right Shift Operator

		a >>= 1;
		System.out.println(" Right Shift bit " + a); // 96 /2^1 = 48

		a >>= 2;
		System.out.println(" Right Shift bit " + a); // 48 /2^2 = 12

		b >>= -1;
		System.out.println(" Right Shift bit " + b); // 0000100 // 1000000100 // 10000010 //-2

	}

}
