package pattern;

public class Fancy_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int row = 0; row < 5; row += 1) {
			for (int col = 0; col < 2 * row + 1; col += 1) {
				if ((col + 1) % 2 == 1) {
					System.out.print(" " + (row + 1));
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}

		for (int row = 5 - 1; row > -1; row -= 1) {
			for (int col = 0; col < 2 * row + 1; col += 1) {
				if ((col + 1) % 2 == 1) {
					System.out.print(" " + (row + 1));
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}

}
