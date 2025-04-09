package bit_manipulation;

public class SetBit_kth {

	public static void main(String[] args) {

		System.out.println(setKthBit(15, 3));
		
		int max=Integer.MAX_VALUE;
		int min= Integer.MIN_VALUE;
		System.out.println(" Max value: "+ max);
		System.out.println(" Min value: "+ min);
		
	}

	static int setKthBit(int n, int k) {
		// code here

		int mask = 1 << k; // 1<<2 ==> 0001 ==> 0010 ==> 0100

		System.out.println(" mask " + mask);

		int ans = mask | n; // 0100 | 1010 ===> 1110 ==>

		return ans;

	}

}
