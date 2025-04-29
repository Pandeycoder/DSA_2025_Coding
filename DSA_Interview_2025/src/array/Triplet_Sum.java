package array;

import java.util.ArrayList;

public class Triplet_Sum {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(11);
		list.add(15);
		list.add(5);
		list.add(7);
		list.add(11);
		list.add(6);
		tripletSum(list);
	}

	public static void tripletSum(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			int element1 = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				int element2 = list.get(j);
				for (int k = j + 1; k < list.size(); k++) {
					if (element1 + element2 + list.get(k) == 45) {
						System.out.println(
								" ( " + list.get(i) + " " + list.get(j) + " " + list.get(k) + " )" + " = " + 45);
					}
				}
			}

		}

	}
}
