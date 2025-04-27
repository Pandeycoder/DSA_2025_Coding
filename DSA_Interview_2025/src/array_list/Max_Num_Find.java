package array_list;

import java.util.ArrayList;

public class Max_Num_Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();

		list.add(100);
		list.add(20);
		list.add(50);
		list.add(5);
		list.add(300);
		list.add(10);
		int max = maxNum(list);
		System.out.println(" max Num is : " + max);
	}

	public static int maxNum(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}

}
