package array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {

		List<Integer> ls1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6,8));
		List<Integer> ls12 = new ArrayList<>(Arrays.asList(3, 4, 9, 10,3,10));

		interSection(ls1, ls12);

	}

	static void interSection(List<Integer> ls1, List<Integer> ls2) {
		int size1 = ls1.size() + ls2.size();
		
		List<Integer> res = new ArrayList<>(size1);

		// Brute Force Approach------1
		for (int i = 0; i < ls1.size(); i++) {
			for (int j = 0; j < ls2.size(); j++) {
				if (ls1.get(i) == ls2.get(j)) {
					ls2.set(j, Integer.MIN_VALUE);
					res.add(ls1.get(i));
					break;
				}
			}
		}
		System.out.println(res);
		System.out.println(ls2);
		
		// Approach-----2
		
		
		
		

	}
}
