package pattern;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pascalTriangle(7);
	}

	public static void pascalTriangle(int n) {

		for (int row = 0; row < 7; row += 1) {
			int c = 1;

			for (int col = 0; col <= row; col += 1) {
				if (col > 0) {
					c = c * (row - col + 1) / col;
				}

				System.out.print(" " + c);

			}
			System.out.println();
		}

	}

}
