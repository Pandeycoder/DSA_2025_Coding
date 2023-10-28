package $1timecomplicity;

public class CountDigit {

	
	static int countDigit(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {
		int count=countDigit(574);
		System.err.println("count digit= "+count);
	
	}

}
