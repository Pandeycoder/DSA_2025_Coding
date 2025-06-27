package tsc_practice;

import java.util.ArrayList;
import java.util.List;

public class GreatNumber {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<>();

		ls.add(10);
		ls.add(67);
		ls.add(13);
		ls.add(15);
		ls.add(69);
		ls.add(56);
		findMaxMin(ls);
	}

	static public void findMaxMin(List<Integer> ls) {
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;

		for (int e : ls) {
			if (maxNum < e) {
				maxNum = e;
			}
			if (minNum > e) {
				minNum = e;
			}
		}

		System.out.println(" maxNum " + maxNum);
		System.out.println(" minNum " + minNum);
	}
}
