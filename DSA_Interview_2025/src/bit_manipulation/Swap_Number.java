package bit_manipulation;

public class Swap_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		swapTwoNum(5, 4);

	}

	public static void swapTwoNum(int a, int b) {
		System.out.println("prev   a : " + a + " b : " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("after  a : " + a + " b : " + b);

	}

}
