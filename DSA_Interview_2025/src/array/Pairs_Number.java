package array;

import java.util.ArrayList;

public class Pairs_Number {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);

		
		pairNum(list);

	}

	
	public static void pairNum(ArrayList<Integer> list) {
		int sum=12;

		for (int i = 0; i < list.size(); i++) {

			int element=list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				if(element+list.get(j)==sum)
				 System.out.print(" (" + list.get(i) + " , " + list.get(j) + " )");

			}
			System.out.println();

		}
	}

}
