package dp_recursive_oct;

public class Power {
	
	  
	    static double powerCal(int r,int n)  // time complexity is O(log n)   space O(1)
	    {   double x=(double)r;
	        double res=1;
	        while(n>0)
	        {
	            if(n%2!=0)
	            {
	                res=res*x;
	            }
	            x=x*x;
	            n=n/2;
	        }
	        
	       
	        return res;
	    }
	    static int powerCal1(int x,int n)  // time complexity is O(n)
	    {
	    	int res=1;
	    	for(int i=0;i<n;i++)
	    	{
	    		res=res*x;
	    	}
	    	return res;
	    	
	    }
	    static int powerCal2(int x,int n)  // time complexity is O(log n)   space O(log n)
	    {
	    	if(n==0)
	    		return 1;
	    	int temp=powerCal2(x,n/2);
	    	temp=temp*temp;
	    	
	    	if(n%2==0)
	    		return temp;
	    	else
	    		return temp*x;
	    }
	    
	   
	 public static void main(String[] args) {
		
		double x=powerCal(3,5);
		System.out.println(x);
		
		
		 int rs=powerCal1(3,5);
		 System.out.println(rs);
		 int rs1=powerCal2(3,5);
		 System.out.println(rs1);
		 
		
	}

}
