package array;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 9, 6, 7, 4, 12, 15 };
		if (findNum(arr, 11))
			System.out.println("we found the value ");
		else
			System.out.println(" Not found");
	}

	public static boolean findNum(int arr[], int search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return true;
			}
		}
		return false;
	}

}
