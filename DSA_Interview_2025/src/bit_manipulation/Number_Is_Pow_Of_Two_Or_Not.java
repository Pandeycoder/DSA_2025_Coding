package bit_manipulation;

public class Number_Is_Pow_Of_Two_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean check = checkNumberIsPowerOfTwoOrNot(12);

		if (check)
			System.out.println(" Number is power of two is : " + check);
		else
			System.out.println(" Number is power of two is not : " + check);

	}

	public static boolean checkNumberIsPowerOfTwoOrNot(int n) {

		// 8 // 1000 // 7 0111 ==> 1000 & 0111 ==0 than true
		return (n & (n - 1)) == 0;

	}

}
