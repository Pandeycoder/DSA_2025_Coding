package array;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };

		revArr(arr, 7);

	}

	public static void revArr(int arr[], int size) {
		int start = 0;
		int end = size - 1;

		while (start < end) {
			swapNum(arr, start, end);
			start++;
			end--;
		}

		for (int k = 0; k < size; k++) {
			System.out.print(" " + arr[k]);
		}
	}

	public static void swapNum(int arr[], int start, int end)
	{
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

	}

}
