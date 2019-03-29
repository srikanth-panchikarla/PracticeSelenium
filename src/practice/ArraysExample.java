package practice;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arrayList = {0.1,1.0,2.0,3.0,4.0,5.0};
		System.out.println(arrayList.length);
		for(int i=0;i<=arrayList.length-1;i++)
		{
		System.out.println("Printing array list values: "+ arrayList[i]);
		}

		
		//Summing all elements
		double total=0;
		for(int i=0;i<=arrayList.length-1;i++)
		{
		total=total + arrayList[i];
	
		}
		System.out.println("Total: "+ total);
			
		//Max number in array
		double max=arrayList[0];
		for(int i=0;i<=arrayList.length-1;i++)
		{
			if(arrayList[i]>max)
				max=arrayList[i];
			
		}
		System.out.println("MAX" + max);
		
	}

}
