package dp_recursive_oct;

public class Gcd {
	
	
	static int gcd1(int a,int b)   //time complexity is O(n)
	{
		int res=Math.min(a, b);
		while(res>0)
		{
			if(a%res==0 && b%res==0)
			{
				break;
			}
			res--;
		}
		return res;
	}
	
	static int gcd(int a,int b)  //time complexity is O(log n)
	{
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
		
	}
	
	
	public static void main(String[] args) {
		int res1=gcd1(4,6);
		System.out.println("n time is result gcd = "+res1);
		
		int res2=gcd(4,6);
		System.out.println("log n time is result gcd = "+res2);
		
	}

}
