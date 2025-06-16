package array;

import java.util.Arrays;
import java.util.Collections;

public class MoveAll_Neg_Number {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, -1, 5, -3, 7, -8 };
		

		moveNega(arr);
	}

	static void moveNega(int arr[]) {
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < 0) {

				int temp = arr[j];
				arr[j] = arr[i];
				arr[i]=temp;
				j++;

			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(" "+arr[i]);
		}
	}

}
