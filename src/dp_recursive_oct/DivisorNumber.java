package dp_recursive_oct;

public class DivisorNumber {
	
	static void divisorNumber(int n)  // time complexity is O(n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println("n time compexity divisor number "+i);
			}
		}
	}
	static void divisorNumber1(int n)
	{
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(" root n divisor number " +i);
				if(i!=n/i)
				{
					System.out.println(" root n divisor number "+n/i);
				}
			}
		}
	}
	static void divisorNumber2(int n)
	{
		int i;
		for(i=1;i*i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("sort order root n time "+i);
			}
		}
		for(;i>=1;i--)
		{
			if(n%i==0)
			{
				System.out.println("sort oder root n time "+n/i);
			}
		}
	}
	
	public static void main(String[] args) {
		divisorNumber(25);
		divisorNumber1(25);
		divisorNumber2(25);
	}

}
