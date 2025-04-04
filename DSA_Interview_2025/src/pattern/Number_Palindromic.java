package pattern;

public class Number_Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palindromicPattern(8);

	}

	
	public static void palindromicPattern(int n)
	{
		for(int row =0; row<n; row +=1)
		{
			for(int space =0; space<n-row; space +=1)
			{
				System.out.print("  ");
			}
			int col=row;
			for(; col>=0; col -=1)
			{
				System.out.print(" "+(col+1));
				
			}
			for(col =col+2; col<=row; col +=1)
			{
				System.out.print(" "+(col+1));
			}
			System.out.println();
		}
		
	}
}
