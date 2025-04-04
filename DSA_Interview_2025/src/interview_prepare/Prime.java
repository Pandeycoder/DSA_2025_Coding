package interview_prepare;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = sc.nextInt();

		if (isPrime(number)) {
			System.out.println(" this is prime " + number);
		} else {
			System.out.println(" This is not prime " + number);
		}

	}

	public static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}
		if (number == 2 || number == 3) {
			return true;
		}
		if (number % 2 == 0 || number % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= number; i += 6) {
			if (number % i == 0 || number % (i + 2) == 0) {
				return false;
			}

		}
		return true;

	}

}
