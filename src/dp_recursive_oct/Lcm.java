package dp_recursive_oct;

public class Lcm {
	
	static int lcm(int a,int b) // time complexity is O(n)
	{
		int res=Math.max(a, b);
		while(true)
		{
			if(res%a==0 && res%b==0)
			{
				return res;
			}
			res++;
		}
	}
	
	static int hcf(int a ,int b)  //time complexity is O(log n)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return hcf(b,a%b);
		}
	}
	
	static int lcm1(int a , int b)
	{
		return (a*b)/hcf(a,b);
	}
	
	public static void main(String[] args) {
		
		
		int lc=lcm(6,4);
		System.out.println("n time complexity lcm = "+lc);
		
		int lc1=lcm1(6,4);
		System.out.println(" log n time in lcm = "+lc1);
	}

}

