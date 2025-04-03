package pattern;

public class Flipped_Solid_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int row = 0; row < 5; row += 1) {
			for (int col = 0; col <5-row; col += 1) {
				System.out.print(" *");
			}
			for (int space = 0; space <2*row+1; space += 1) {
				System.out.print("  ");
			}
			
			for (int col = 0; col <5-row; col += 1) {
				System.out.print(" *");
			}
			System.out.println();
			
		}
		
		for (int row = 5; row > -1; row -= 1) {
			for (int col = 0; col <5-row; col += 1) {
				System.out.print(" *");
			}
			for (int space = 0; space <2*row+1; space += 1) {
				System.out.print("  ");
			}
			
			for (int col = 0; col <5-row; col += 1) {
				System.out.print(" *");
			}
			System.out.println();
			
		}

		
	}

}
