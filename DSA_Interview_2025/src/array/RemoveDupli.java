package array;

import java.util.HashSet;

public class RemoveDupli {

	public static void main(String[] args) {

		int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int count = removeDuplicates(arr);
		System.out.println(" count " + count);

		int sec = removeDup(arr);
		System.out.println(" sec " + sec);
	}

	public static int removeDuplicates(int[] nums) {
		HashSet<Integer> count = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			count.add(nums[i]);
		}
		return count.size();

	}

	static int removeDup(int nums[]) {

		int j = 0;
		for (int i = 1; i < nums.length; i++) // [1,1,2]
		{
			if (nums[i] != nums[j]) // 1 != 1 // 1 != 2
			{
				j++; // 1 // i=2
				nums[j] = nums[i];

			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(" " + nums[i]);
		}
		return (j + 1);

	}

}
