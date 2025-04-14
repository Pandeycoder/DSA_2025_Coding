package array_list;

import java.util.ArrayList;

public class Swap_Two_Num {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(30);
		list.add(50);
		list.add(5);
		list.add(20);
		System.out.println("before swap " + list);
		swapNum(list, 1, 2);

	}

	public static void swapNum(ArrayList<Integer> list, int index_one, int index_two) {

		int temp = list.get(index_one);
		list.set(index_one, list.get(index_two));
		list.set(index_two, temp);
		System.out.println("after swap: " + list);

	}
}
