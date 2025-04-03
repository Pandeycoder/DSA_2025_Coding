package pattern;

public class Alphabet_Palindrome_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int row=0; row<6; row +=1)
		{
			int col;
			for( col =0; col<row; col +=1)
			{
				System.out.print(" "+(char)('A'+col));
			}
			col =col-1;
			for(; col>=1; col=col-1)
			{
				System.out.print(" "+(char)(col-1+'A'));
			}
			System.out.println();
		}

	}

}
