package pattern;

public class Hollow_Diamond {
	public static void main(String[] args) {
		for (int row = 0; row < 5; row += 1) {
			for (int space = 0; space < 5 - row; space += 1) {
				System.out.print("  ");
			}
			for (int col = 0; col < (row * 2 + 1); col += 1) {
				if (col == 0)
					System.out.print(" *");
				else if (col == 2 * row) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		for (int row = 5; row >= 0; row -= 1) {
			for (int space = 0; space < 5 - row; space += 1) {
				System.out.print("  ");
			}
			for (int col = 0; col < (row * 2 + 1); col += 1) {
				if (col == 0)
					System.out.print(" *");
				else if (col == 2 * row) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
