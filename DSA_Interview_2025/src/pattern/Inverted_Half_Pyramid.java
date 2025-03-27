package pattern;

public class Inverted_Half_Pyramid {
	
	public static void main(String[] args) {
		
		
		
		int n=5;
		for(int row=0; row<n; row++)
		{
			for(int col=0; col<n-row; col +=1  )
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
		
		
		
		
		System.out.println();
		
		for(int row=0; row<n; row++)
		{
			for(int col=0; col<n-row; col +=1  )
			{
				System.out.print(" "+(col+1));
			}
			
			System.out.println();
		}
		
	}

}
