package bit_manipulation;

public class Add_Integer_Number_One_To_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = sumOfTwo(5);
		System.out.println("sum of Number : " + x);

	}

	public static int addNum(int a, int b) {

		System.out.println("prev a " + a + " b " + b);
		while (b != 0) {

			int temp = (a & b);

			a = a ^ b;

			b = temp << 1;
			System.out.println(" a "+a +" b: "+b);

		}
		return a;
	}

	public static int sumOfTwo(int n) {

		if (n == 0)
			return 0;
		return addNum(n, sumOfTwo(n - 1));
	}

}
