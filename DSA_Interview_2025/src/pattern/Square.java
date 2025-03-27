package pattern;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : -");
		int n=sc.nextInt();
		
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {

				System.out.print(" *");
			}

			System.out.println();
		}

	}
}
