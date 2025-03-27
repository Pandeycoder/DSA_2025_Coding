package pattern;

public class Number_Half_Pyramid {

	public static void main(String[] args) {

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < row + 1; col += 1) {
				System.out.print(" " + (col + 1));
			}
			System.out.println();
		}
	}

}
