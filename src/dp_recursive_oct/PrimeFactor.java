package dp_recursive_oct;

public class PrimeFactor {
	
	static boolean isPrime(int n)
	{
		if(n==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)
				return false;
			
		}
		return true;
	}
	static void primeFactor(int n)   //time complexity is O (n log n) 
	{
		for(int i=2;i<n;i++)
		{
			if(isPrime(i))
			{
				int x=i;
				while(n%x==0)
				{
					System.out.println("time prime factor "+i );
					x=x*i;
				}
			}
		}
	}
	
	static void primeFactor1(int n)   //time complexity is O (n) 
	{
		if(n<=1)
			return ;
		for(int i=2;i*i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.println("prime factor = "+i);
				n=n/i;
			}
		}
		if(n>1)
		 System.out.println("prime factor = "+n);
	}
	
	static void primeFactor2(int n)   //time complexity is    O( root n)
	{
		if(n<=1)
			return ;
		while(n%2==0)
		{
			System.out.println(2);
			n=n/2;
		}
		while(n%3==0)
		{
			System.out.println(3);
			n=n/3;
		}
		for(int i=5;i*i<=n;i=i+6)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
			while(n%(i+2)==0)
			{
				System.out.println(i);
				n=n/(i+2);
			}
			
		}
		if(n>3)
			System.out.println(n);
		
	}
	

	public static void main(String[] args) {
	       primeFactor(12);	
	       primeFactor1(12);
	       primeFactor2(12);
	} 
	

}
