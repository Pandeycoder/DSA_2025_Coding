package array_2d;

public class RowSum {
	
	public static void main(String[] args) {
		
		int arr[][]= {{10,20,30},{30,12,34},{12,12,11}};
		
		sumOfRow(arr,3,3);
		
		
		
	}
	
	static  void sumOfRow(int arr[][], int col1, int row1)
	{
		for(int row=0;row<arr.length;row++)
		{
			int sum=0;
			for(int col=0; col<arr.length;col++)
			{
				sum=sum+arr[row][col];
				
			}
			System.out.println("row of "+(row+1)+" sum : "+sum);
		}
		
		System.out.println();
		
		for(int col=0;col<col1;col++)
		{
			int sum=0;
			for(int row=0; row<row1;row++)
			{
				sum=sum+arr[row][col];
				
			}
			System.out.println("row of "+(col+1)+" sum : "+sum);
		}
	}
	

}
