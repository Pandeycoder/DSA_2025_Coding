package dp_recursive_oct;

public class Prime_No {
	
	static boolean isPrime(int n)
	{
		if(n==1)
			return false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	static boolean isPrime1(int n)
	{
		if(n==1)
			return false;
	     if(n==2 || n==3)
			return true;
		int count=0;
		for(int i=1; i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			return true;
		}
		return false;
	}
	
	static boolean isPrime2(int n)  // root n time complexity for prime number
	{
		if(n==1)
			return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	static boolean isPrime3(int n)   //O (log n)
	{
		if(n==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
		{
			return false;
		}
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		
		boolean x=isPrime(11);
		System.out.println("n time complexity prime number = "+x);
		
		boolean x1=isPrime1(19);
		System.out.println("root n time complexity prime number = "+x1);
		
		boolean x2=isPrime2(12);
		System.out.println("root n time compexity prime number cal =  "+x2);
		
		boolean x3=isPrime(13);
		System.out.println("less than root n time compelxity  "+x3);
	}

}
