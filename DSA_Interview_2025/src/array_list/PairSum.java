package array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
		List<Integer> ls2 = new ArrayList<>(Arrays.asList(2, 4, 6));
		pairSum(ls, ls2, 9);
	}

	static void pairSum(List<Integer> ls1, List<Integer> ls2, int sum) {
		System.out.println("start...");

		for (int i = 0; i < ls1.size(); i++) {

			for (int j = 0; j < ls2.size(); j++) {

				if (ls1.get(i) + ls2.get(j) == sum) {
					System.out.println(ls1.get(i) + " " + ls2.get(j));
					return;

				}

			}
		}
	}

}
