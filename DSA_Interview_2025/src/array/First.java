package array;

public class First {

	public static void main(String[] args) {

		// Declare
		int arr[] = null;
		arr = new int[45];
		System.out.println(" hashCode " + arr); // this one give me hexadecimal number
		System.out.println(" address  " + arr.hashCode()); // this one give integer number

		// initialization
		int arr2[] = { 2, 4, 5, 6, 7 };

		int arr3[] = new int[] { 10, 20, 30, 45 };

		int arr4[] = new int[5];
		arr4[0] = 10;
		arr4[3] = 30;

		// diff diff data types with arrays

		int marks[] = new int[50];

		String fruitsName[] = new String[50];

		double salary[] = new double[50];

		boolean userActive[] = new boolean[50];

		char name[] = new char[50];

	}

}
