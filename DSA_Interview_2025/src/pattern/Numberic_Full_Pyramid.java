package pattern;

public class Numberic_Full_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int row = 0; row < 5; row += 1) {

			for (int space = 0; space < 5 - row; space += 1) {
				System.out.print("  ");
			}
			// int count=row+1;
			int col = 0;
			for (; col < row + 1; col += 1) {

				System.out.print(" " + (col + row + 1));

			}
			col = col - 1;
			for (; col >= 1; col -= 1) {
				System.out.print(" " + (col + row));
			}

			System.out.println();
		}

	}

}
