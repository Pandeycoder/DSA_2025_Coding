package $1timecomplicity;


public class Diff_Time_Complexity {
	
	
	static int sum_of_natural1(int n)
	{
		sum_of_natural2(n);
		return n*(n+1)/2;
	}
	
	static void sum_of_natural2(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("average time compexity= "+sum);
		sum_of_natural3(n);
	}
	static void sum_of_natural3(int n)
	{
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				sum++;
			}
		}
		System.out.println("WORST CASE sum= "+sum);
	}
	
	static int sum_of_natural4(int n)
	{
		if(n<=1)
			return 1;
		else
			return n+sum_of_natural4(n-1);
		
	}
	
	public static void main(String[] args) {
		
		
		int s=sum_of_natural1(5);
		System.out.println("best case= "+s);
		
		int s1=sum_of_natural4(5);
		System.out.println("very wrost case sum of natural number= "+s1);
	}

}
