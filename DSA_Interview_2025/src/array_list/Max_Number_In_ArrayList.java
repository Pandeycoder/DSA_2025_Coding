package array_list;

import java.util.ArrayList;

public class Max_Number_In_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(30);
		list.add(5);
		list.add(99);
		list.add(2);
		int max = maxNum(list);
		System.out.println(" Max number: " + max);

	}

	public static int maxNum(ArrayList<Integer> arr) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.size(); i++) {
			if (max < arr.get(i)) {
				max = arr.get(i);
			}
		}
		return max;
	}

}
