package array_2d;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {

		int arr[][] = { { 10, 20, 30 }, { 20, 30, 50 } };

		System.out.println(arr[0][0]);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		int arr1[][]=new int[2][2];
		
		takeInput(arr1);

		display(arr1);
	}

	static public void takeInput(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {

				System.out.print(" Enter a number row "+(row+1)+" col "+(col+1)+" : ");
				
				arr[row][col]=sc.nextInt();
			}
			
		}
		sc.close();
	}
	static void display(int arr[][])
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr.length;col++)
			{
				System.out.print(" "+arr[row][col]);
			}
			System.out.println();
		}
		
	}

}
