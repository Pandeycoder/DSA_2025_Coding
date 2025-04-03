package pattern;

public class Numeric_Hollow_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int row = 0; row < 5; row += 1) {
			int start = 1;
			for (int space = 0; space < 5 - row; space += 1) {
				System.out.print("  ");
			}
			for (int col = 0; col < row * 2 + 1; col += 1) {
				if (row == 0 || row == 4)

				{
					if (col % 2 == 0) {
						System.out.print(" " + start);
						start++;
					} else {
						System.out.print("  ");
					}

				} else {
					if (col == 0) {
						System.out.print(" 1");
					} else if (col == row * 2) {
						System.out.print(" " + (row + 1));
					} else {
						System.out.print("  ");
					}

				}

			}
			System.out.println();
		}

	}

}
