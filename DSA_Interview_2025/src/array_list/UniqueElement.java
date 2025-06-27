package array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UniqueElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int capacity = 5;

		List<Integer> arr = new ArrayList<>();

//		for (int i = 0; i < capacity; i++) {
//			System.out.print("Enter a number " + (i + 1) + ": ");
//			arr.add(sc.nextInt());
//		}
//
//		int uniqueNum = findUnique(arr);
//		System.out.println(" Unique Number " + uniqueNum);

		List<Integer> ls1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
		List<Integer> ls2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

		unionNum(ls1,ls2);
	}

	static int findUnique(List<Integer> ls) {

		int ans = 0;
		for (int i = 0; i < ls.size(); i++) {
			ans = ans ^ ls.get(i); // 0^2----> 2^1--->
			System.out.println(ans);

		}
		System.out.println(" XOr " + (2 ^ 3));
		return ans;
	}

	static void unionNum(List<Integer> ls1, List<Integer> ls2) {
		int size1 = ls1.size() + ls2.size();

		List<Integer> ls = new ArrayList<>(size1);

		for (int i = 0; i < ls1.size(); i++) {
			ls.add(ls1.get(i));
		}
		for (int i = 0; i < ls2.size(); i++) {
			ls.add(ls2.get(i));
		}
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
	}

}
