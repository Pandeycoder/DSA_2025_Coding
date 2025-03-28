package pattern;

public class Full_Pyramid {
	public static void main(String[] args) {

		for (int row = 0; row < 6; row += 1) {
			for (int space = 0; space < 6 - row; space += 1) {
				System.out.print("  ");
			}
			for (int col = 0; col < (row * 2-1 ); col += 1) {

				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int row = 5; row > 0; row -= 1) {
			for (int space = 0; space < 6 - row; space += 1) {
				System.out.print("  ");
			}
			for (int col = 0; col < (row * 2-1 ); col += 1) {

				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
