package array;

public class SecondLarg_Sec_Smal {

	public static void main(String[] args) {

		int arr[] = { 23, 23, 1, 13, 11, 17, 45, 45, 50 };

		checkSecLargests(arr);
		checkSmallest(arr);
	}

	static public void checkSmallest(int arr[]) {

		int secMin = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i]) {
				secMin = smallest;
				smallest = arr[i];
			}
			if (secMin > arr[i] && arr[i] != smallest) {
				secMin = arr[i];
			}
		}
		System.err.println("Sec min " + secMin);

	}

	static public void checkSecLargests(int arr[]) {

		int secLargest = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) // 23 // 23 //1 //13// 45
			{
				secLargest = largest; // min 23
				largest = arr[i]; // 45

				System.out.println("lar " + largest);

			}

			if (arr[i] > secLargest && arr[i] != largest) // 45>45 45!=45
			{
				secLargest = arr[i]; // 1 // 13 //17
				System.out.println(" sec " + secLargest);
			}

		}

		System.out.println(" " + secLargest);

	}
}
