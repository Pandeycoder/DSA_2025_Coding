package pattern;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		
		
		for(int row=0;row<5; row += 1)
		{
			for(int col=0; col<row+1; col +=1)
			{
				System.out.print(" *");
			}
			
			
			System.out.println();
		}
		
	}

}
