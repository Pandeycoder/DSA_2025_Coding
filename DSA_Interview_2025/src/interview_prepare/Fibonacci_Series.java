package interview_prepare;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number =sc.nextInt();
		febiSeries(number);

	}
	
	public static void febiSeries(int n)// 0 ,1, 1 , 2 , 3 ,5, 8
	{
		
		int first=0;
		int second=1;
		System.out.print(first+ " "+second);
		for(int i=0; i<n; i++)
		{
			int temp= first+second;
			
			first=second;
			second=temp;
			System.out.print(" "+temp);
			
		}
		
		
	}

}
