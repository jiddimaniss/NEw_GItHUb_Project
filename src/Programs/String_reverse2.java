package Programs;

public class String_reverse2 {

	public static void main(String[] args) {
		
		//For using for loop
		
		String str="Eclipse";

		int r=str.length();
		
		String c=" ";
		
		for(int i=r-2;i>0;--i)
		{
			
			c=c+str.charAt(i);
			System.out.println(c);
			
		}
				
		
		
	}

}

















