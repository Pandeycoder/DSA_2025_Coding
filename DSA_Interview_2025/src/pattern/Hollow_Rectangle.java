package pattern;

import java.util.Scanner;

public class Hollow_Rectangle {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int rowCount=sc.nextInt();
		int colCount=sc.nextInt();
		
		for(int row =0; row<rowCount; row +=1)
		{	
			for(int col=0;col<colCount; col+=1)
			{
				if(row ==0 || row== rowCount-1 || col==0 || col==colCount-1)
				System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
