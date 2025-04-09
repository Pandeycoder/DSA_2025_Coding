package bit_manipulation;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		decimalToBinary(7);

	}

	public static void decimalToBinary(int n) {

		int bin = 0;
		int i = 0;
		while (n > 0) {
			int bit = (n & 1);   // 111 1  //111
			bin = bit * (int) (Math.pow(10, i++) + bin);

			n = n >> 1;
		}

		System.out.println(" bInary value : "+bin);

	}

}
