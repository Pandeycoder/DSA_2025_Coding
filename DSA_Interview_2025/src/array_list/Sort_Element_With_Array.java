package array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Element_With_Array {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(45);
		list.add(8);
		list = sortElement(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

	public static ArrayList<Integer> sortElement(ArrayList<Integer> list) {
		Collections.sort(list);
		return list;
	}

}
