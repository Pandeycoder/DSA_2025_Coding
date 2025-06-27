package string;

public class UniqueChar {
	
	public static void main(String[] args) {
		firstUniqChar("abcdea");
	}
	
	    public static void firstUniqChar(String s) {
	        
	        int count[]=new int[50];
	        
	        for(char ch : s.toCharArray())
	        {
	          // 97-97==> 0  ==> 98-97==> 1
	          System.out.println( count[ch-'a']++);
	        }
	     
	        for(int i=0; i<count.length; i++)
	        {
	        	System.out.print(" "+count[i]);
	        }
	           for (int i = 0; i < s.length(); i++) {
	            if (count[s.charAt(i) - 'a'] == 1)
	            {
	            	// System.out.println(i);
	            }
	        }

	      
	    }
	

}
