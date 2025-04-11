package array;

public class Extreme_Print {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7,8 };
		extremePrint(arr, 8);
	}

	public static void extremePrint(int arr[], int size) {
		int j = size - 1;
		int i = 0;
		while (i < j) {
			System.out.print(" " + arr[i] + " " + arr[j]);
			j--;
			i++;
			
			if(i==j)
			{
				System.out.print(" "+arr[i]);
			}
			
		}

	}
}
