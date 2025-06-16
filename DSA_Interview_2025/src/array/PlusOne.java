package array;

public class PlusOne {
	
	
	

	    public int[] plusOne(int[] digits) {
	        
	        if(digits[digits.length-1]>8)
	        {
	            
	             for(int i=0; i<digits.length; i++)
	        {
	              digits[i]=digits[i]+1;
	                 
	                 
	        }
	            return digits;
	        }
	        
	        else
	        {
	            digits[digits.length-1]=digits[digits.length-1]+1;
	                return digits;
	        }
	    
	     
	       
	    }
	
}


