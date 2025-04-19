package array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Union_Of_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 3, 5, 7, 9 };
		int brr[] = { 2, 4, 6, 8 };

		unionOfTwoArray(arr, brr);

	}

	public static void unionOfTwoArray(int arr[], int brr[]) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			list.add(arr[i]);

		}
		for (int i = 0; i < brr.length; i++) {
			list.add(brr[i]);
		}
		Collections.sort(list);

		System.out.println(list);
	}

}
