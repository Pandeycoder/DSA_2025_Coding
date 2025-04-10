package array;

public class Target {

	public static int[] twoSum(int[] nums, int target) {

		int arr[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}

		}
		return arr;

	}
	
	
	
	public static int[] twoSum1(int[] nums, int target) {

		int arr[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] + nums[i++] == target) {
				arr[0] = i;
				arr[1] = i++;
				return arr;
			}
			
		}
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 7, 8, 6, 2 };

		int res[] = new int[2];
		res = twoSum1(arr, 9);
		System.out.println(" res " + res[0] + " " + res[1]);

	}

}