package practice;

public class reverseString {

	public static void main(String[] args) {
		
		reverseString rev=new reverseString();
		rev.reverseWithoutStringbuilder();

	}

	
	public void reverserWithStringbuilder()
	{
		
		String str= "Srikanth";
		StringBuilder stringbuilder= new StringBuilder(str).reverse();
		
		//stringbuilder.append(str);
		//stringbuilder=stringbuilder.reverse();
		System.out.println(stringbuilder);
		
	}
	
	public void reverseWithoutStringbuilder()
	{
		String str="Srikanth";
		
		char[] chars = str.toCharArray();
		System.out.println(str.toCharArray());
		System.out.println(chars.length-1);
		for(int i=chars.length-1;i>=0;i--)
		{
			
			System.out.print(chars[i]);
			
		}
		
	}
}
