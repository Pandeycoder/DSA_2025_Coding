package pattern;

public class Zero_One_Triangle {

	public static void main(String[] args) {

		for (int row = 0; row < 5; row += 1) {

			for (int col = 0; col < row + 1; col += 1) {
				
				if( (col+row+1)%2 ==0)
				{
					System.out.print(" 0");
				}
				else
				{
					System.out.print(" 1");
				}

			}
			System.out.println();
		}
	}

}
