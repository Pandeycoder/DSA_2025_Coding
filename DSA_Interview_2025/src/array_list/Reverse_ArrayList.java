package array_list;

import java.util.ArrayList;

public class Reverse_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(12);
		list.add(134);
		list.add(45);
		System.out.println("Before rev "+list);
		ArrayList<Integer> list1 = printReverse(list);
		System.out.println("after rev arr " + list1);


	}

	public static ArrayList<Integer> printReverse(ArrayList<Integer> arr) {

		int start = 0;
		int end = arr.size() - 1;

		while (start <= end) {
			swapNum(arr, start, end);
			start++;
			end--;
		}
		
		return arr;

	}

	public static void swapNum(ArrayList<Integer> arr, int start, int end) {

		int temp = arr.get(start); // 10
		arr.set(start, arr.get(end));
		arr.set(end, temp);
	}

}
