package dp_recursive_oct;

public class Febonacci {

	
	static int febonacci_method1(int n)   //simple recursive method 
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		return febonacci_method1(n-1)+febonacci_method1(n-2);   // **** time complexity =  2^n ****
	}
	
	static int febonacci_method2(int n,int dp[])
	{
		int i=0;
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		if(dp[i]!=-1)
		{
			return dp[i];
		}
		
		int val=febonacci_method2(n-1,dp)+febonacci_method2(n-2,dp);    //**** time complexity = n space=n  ****
		dp[i]=val;
		
		return dp[n];	
	}
	
	public static void main(String[] args) {
		int n=6;
		int feb1=febonacci_method1(n);
		System.out.println("method1 febi="+feb1);
		
		int dp[]=new int[n+1];
		
		int i;
		for( i=0;i<dp.length-1;i++)
		{
			dp[i]=-1;
		}
		
		int feb2=febonacci_method2(n,dp);
		System.out.println("method2 febi= "+feb2);
		
	}
}
