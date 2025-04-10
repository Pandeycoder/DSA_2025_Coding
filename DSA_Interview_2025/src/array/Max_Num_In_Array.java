package array;

public class Max_Num_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 4, 1, 6, 8, 9, 1 };
		System.out.println(" max num in array: " + maxNum(arr, 7));

	}

	public static int maxNum(int arr[], int size) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(" min: "+min);
		return max;
	}

}
