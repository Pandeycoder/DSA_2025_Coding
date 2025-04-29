package array;

import java.util.ArrayList;

public class Sort_Zero_One {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		sortZeroOne(list);
		System.out.println(list);
	}

	public static void sortZeroOne(ArrayList<Integer> list) {

		// two pointer approach (start & end)

		int start = 0;
		int end = list.size() - 1;
		int i = 0;

		while (start <= end) {
			if (list.get(i) == 0) { // false
				System.out.println("if value " + list.get(i) + " " + list.get(start));

				swap(list, start, i);

				i++;
				start++;
			} else if (list.get(i) == 1) { // true //
				System.out.println("else if value " + list.get(i) + " " + list.get(end));
				swap(list, i, end); //

				end--;

			}
		}

	}

	public static void swap(ArrayList<Integer> list, int start, int end) {
		System.out.println(" before " + list.get(start) + " " + list.get(end));
		int temp = list.get(start);
		list.set(start, list.get(end));
		list.set(end, temp);

		System.out.println("after " + list.get(start) + " " + list.get(end));

	}

}
