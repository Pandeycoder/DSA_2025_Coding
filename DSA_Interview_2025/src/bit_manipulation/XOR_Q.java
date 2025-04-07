package bit_manipulation;

public class XOR_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val = checkXOR(4);
		System.out.println(" val :-  " + val);

	}

	public static int checkXOR(int n) { // 100 011 ==> 111

		return (n ^ 3); // 0 0--> 0 // 1 1 => 1 // 0
	}

}
