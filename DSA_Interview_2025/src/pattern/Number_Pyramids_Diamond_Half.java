package pattern;

public class Number_Pyramids_Diamond_Half {


	public static void main(String[] args) {
		
		int count=1;
		for(int row =0; row<5; row +=1)
		{
			
			for(int space=0; space<5-row; space++)
			{
				System.out.print("  ");
			}
			
			for(int col=0; col<count; col +=1)
			{
				System.out.print("  "+(count));
			}
			count +=1;
			System.out.println();
				
		}
	}
}