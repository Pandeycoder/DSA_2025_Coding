package array;

import java.util.Arrays;

public class All_Duplicate {

	// Remove all the duplicate elements from integer array
	public static void main(String[] args) {
		int arr[] = { 10, 14, 11, 10, 15, 16, 17 };
		Arrays.sort(arr);

		removeAllDuplicate(arr);
	}

	static void removeAllDuplicate(int arr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == arr[i++] && i < arr.length && arr[i] > 0) {
				arr[i] = 0;
			}
		}
        Arrays.sort(arr);;
		for (int k = 0; k < arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
	}
}
