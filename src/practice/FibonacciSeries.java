package practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int sum;
		int n=2;
		for (int i=0;i<=n;i++)
		{
			System.out.println("Fibonacci of "+ num1);
			sum= num1 + num2;
			num1=num2;
			num2=sum;
			
		}
				

	}

}
