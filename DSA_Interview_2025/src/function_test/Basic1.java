package function_test;

public class Basic1 {

	public static void main(String[] args) { // main function return the OS

		System.out.println(" Max Number is : " + maxOf(10, 20));
	}

	public static int maxOf(int a, int b) {

		if (a > b)
			return a;
		else
			return b;

	}

}
