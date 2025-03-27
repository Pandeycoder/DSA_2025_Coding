package pattern;

public class Solid_Rhombus {
	public static void main(String[] args) {
		
		
		
		for(int row =0; row <5; row +=1)
		{
			for(int space =0 ;space<5-row; space +=1)
			{
				System.out.print(" ");
			}
			
			for(int col =0; col<5; col++)
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}

}
