package practice;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reminder, temp;
		double sum = 0;
	      int m = 151;
	      int n = m;
	      //temp = n;
	      while (n > 0) {
	         reminder = n % 10;
	         sum = (sum * 10) + reminder;
	         System.out.println("sum " +sum);
	         n = n / 10;
	     }
	     if (m == sum) {
	        System.out.println(m + " is a palindrome number.");
	     } else {
	        System.out.println(m + " is not a palindrome number.");
	     }
	     
	     
	     n = m;
	     String s1= Integer.toString(n);
	     StringBuilder s2= new StringBuilder(s1).reverse();
	     n = Integer.parseInt(s2.toString());
	     if(n==m) {
	    	 System.out.println("Palindrome");
	     }else {
	    	 System.out.println("Not");
	     }
	}

}
