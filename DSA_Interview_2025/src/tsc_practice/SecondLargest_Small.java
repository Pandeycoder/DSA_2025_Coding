package tsc_practice;

import java.util.ArrayList;
import java.util.List;

public class SecondLargest_Small {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<>();

		ls.add(200);
		ls.add(67);
		ls.add(13);
		ls.add(15);
		ls.add(69);
		ls.add(56);
		ls.add(40);
		ls.add(70);
		ls.add(100);
		ls.add(100);
		findSecLarSmall(ls);
	}

	static void findSecLarSmall(List<Integer> ls) {

		int maxNum = Integer.MIN_VALUE;

		int minNum = Integer.MAX_VALUE;

		int secMax = Integer.MIN_VALUE;

		int secMin = Integer.MAX_VALUE;

		for (int e : ls) {

			if (maxNum < e) {

				secMax = maxNum; // -47474 // 10 //67
				maxNum = e; // 10 //67 //69
			}
			if (secMax < maxNum && e != maxNum) {
				secMax = e;

			}

			if (minNum >e) {
				secMin=minNum;
				minNum = e;
				
				System.out.println("time 1 "+minNum);

			}
			if(e<secMin && e!=minNum ) // 15 !=13  15>13
			{
				secMin=e;
				
			}
			

		}
		System.out.println(" Sec Max " + secMax);

		System.out.println(" Sec Min "+secMin);
	}
}
