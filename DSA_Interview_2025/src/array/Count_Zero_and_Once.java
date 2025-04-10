package array;

public class Count_Zero_and_Once {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 0, 0, 1, 0, 1, 1, 1, 0, 0 };
		int arr1[] = countZeroOne(arr, 0, 0);
		System.out.println(" count zero :" + arr1[0] + "\n count one is : " + arr1[1]);

	}

	public static int[] countZeroOne(int arr[], int countZero, int countOne) {

		int arr1[] = new int[2];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
				countOne++;
			else if(arr[i]==0)
				countZero++;

		}
		arr1[0] = countOne;
		arr1[1] = countZero;
		return arr1;

	}
}
