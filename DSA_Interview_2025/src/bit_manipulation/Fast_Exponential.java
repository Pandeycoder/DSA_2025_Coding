package bit_manipulation;

public class Fast_Exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkFastExpon(3, 5);
	}

	public static long checkFastExpon(int a, int b) {
		long result = 1;
		while (b > 0) {// 5 ==> 2 ==> 1
			System.out.println(b + " " + (b & 1)); // 101 & 0001 =1 // 10 &01 ==> 000 // 01 & 01 ==> 01
			if ((b & 1) == 1) { // odd

				result *= a; // res = 1*3 =3 // 3*81 ==> 243
			}
			a *= a; // 3*3=9 9*9 ==>81 // 81*81 ==>
			b >>= 1; // 101 => 10 ==> 01 // 0 // x/2^n
		}
		return result;
	}
}
