package array_list;

import java.util.ArrayList;

public class Reverse_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(12);
		list.add(134);
		list.add(45);
		System.out.println(list);
		ArrayList<Integer> list1 = printReverse(list);

	}

	public static ArrayList<Integer> printReverse(ArrayList<Integer> arr) {

		
		int start=0; 
		int end=arr.size()-1;
		System.out.println(" start "+start+" end "+end);
		
		while(start<=end)
		{
			int temp =arr.get(start);  //  10
			
			
			arr.set(end, arr.get(start));  //10
			
			arr.set(start, arr.get(end)); 
			
			start++;
			end--;
		}
		System.out.println("arr "+arr);
			
			
		
		return arr;

	}

}

