package practice;

	public class AmstrongNumber {
	
		public static void main(String[] args) {
		double sum = 0;
			int m=153;
			int reminder;
		      int n = m;
		      //temp = n;
		      while (n > 0) {
		         reminder = n % 10;
		         sum = sum + Math.pow(reminder,3);
		         n = n / 10;
		        		     }
		     if (m == sum) {
		        System.out.println(m + " is a amstrong number.");
		     } else {
		        System.out.println(m + " is not a amstrong number.");
		     } 
	
		    		     
		}

}
