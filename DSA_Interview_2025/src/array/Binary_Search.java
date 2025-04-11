package array;

public class Binary_Search {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10, 12, 14 }; // search
		System.out.println(binarySearch(arr, 7, 10));
	}

	public static int binarySearch(int arr[], int size, int key) {
		int start = 0;
		int end = size - 1;

		while (start <= end) { // if number is short logn (2^k)
			int mid = start + end / 2;

			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				start++;
			} else {
				end--;
			}
		}
		return -1;
	}

}
