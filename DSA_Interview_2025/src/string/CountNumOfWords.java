package string;

public class CountNumOfWords {

	public static void main(String[] args) {
countWord( "Welcome to Java");
	}
	
	public static void countWord(String name)
	{
		int count=1;
		for(int i=0; i<name.length();i++)
		{
			if(name.charAt(i)==' ' && name.charAt(i+1) !=' ')
			{
				count++;
			}
			
		}
		
		System.out.println(" count words "+count);
	}

}
