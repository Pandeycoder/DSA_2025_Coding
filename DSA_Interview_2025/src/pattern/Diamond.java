package pattern;

public class Diamond {
	public static void main(String[] args) {
        
		int count=1;
		for (int row = 0; row < 5; row += 1) {
			for (int space = 0; space < 4 - row; space += 1) {
				System.out.print("  ");
			}
			for (int col = 0; col < count; col += 1) {
				System.out.print(" *");

			}
           count +=2;
			System.out.println();
		}
		
		int count1=4*4+1;
		for (int row = 4; row >= 0; row -= 1) {
			for (int space = 0; space < 4 - row; space += 1) {
				System.out.print("  ");
			}
			for (int col = 0; col < count1; col += 1) {
				System.out.print(" *");

			}
           count1 -=2;
			System.out.println();
		}

	}

}
