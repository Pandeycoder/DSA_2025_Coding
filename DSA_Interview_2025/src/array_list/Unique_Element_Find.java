package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Unique_Element_Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a  size of array: ");
		n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			System.out.println("Enter a number " + (i + 1) + " : - ");
			list.add(sc.nextInt());

		}

		int uniqueElement = findUnique(list);
		System.out.println(" Unique Element is " + uniqueElement);

	}

	public static int findUnique(ArrayList<Integer> list) {
		int unique = 0;
		for (int i = 0; i < list.size(); i++) {
			unique = unique ^ list.get(i);

		}
		return unique;

	}

}
