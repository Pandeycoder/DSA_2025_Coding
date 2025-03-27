package pattern;

public class Floyds_Triangle {

	public static void main(String[] args) {

		int patt = 1;
		for (int row = 0; row < 5; row += 1) {

			for (int col = 0; col < row + 1; col += 1) {
				System.out.print(" " + (patt));
				patt++;
			}
			System.out.println();

		}

	}

}
