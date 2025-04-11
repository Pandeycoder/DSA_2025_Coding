package array_list;

import java.util.*;

public class Class_Room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<>();

		ArrayList<Boolean> list3 = new ArrayList<>();

		ArrayList<String> list4 = new ArrayList<>();

		System.out.println(list1.size());

		// add element------------

		list1.add(10); // O(1)
		list1.add(20);
		list1.add(30);
		System.out.println(list1);

		// get element------------
		System.out.println(list1.get(2));

		// remove element
		list1.remove(2); // n
		System.out.println(list1);

		// set value
		list1.set(1, 100);
		System.out.println(list1);

		System.out.println(list1.contains(1));
		System.out.println(list1.contains(100));

		list1.add(0, 9); // O(n)
		System.out.println(list1);
		
		System.out.println(list1.size());
		
		
		for(int i=0; i<list1.size(); i++)
		{
			System.out.print(list1.get(i)+" ");
		}

		

	}

}
