package dp_recursive_oct;

public class Seve_Prime {
	
	static void primeSeve(int n)  // time complexity is O( n log log n)
	{
		boolean[] check=new boolean[n+1];
		for(int i=0;i<check.length;i++)
		{
			check[i]=true;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(check[i])
			{
				for(int j=i*i;j<=n;j=j+i )
				{
					check[j]=false;
				}
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(check[i])
			{
				System.out.println(i);
			}
		}
		
	}
	static void primeCheck(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(checkPrime(i))
			{
				System.out.println("prime  "+i);
			}
		}
	}
	static boolean checkPrime(int n)  // time complexity is O (n root n)
	{
		if(n==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5;i*i<n;i=i+6)
		{
			if(n%i==0 && n%(i+2)==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		primeSeve(9);
		
		primeCheck(9);
	}

}
