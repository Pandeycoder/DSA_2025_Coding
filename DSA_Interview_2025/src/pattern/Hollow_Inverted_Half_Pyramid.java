package pattern;

public class Hollow_Inverted_Half_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int row = 0; row < 6; row += 1) {

			for (int col = 0; col < 6; col += 1) {
				
				
				if(row ==0 ||  col==0 || row+col==6-1 )
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
					

			}
			System.out.println();
		}

	}

}
