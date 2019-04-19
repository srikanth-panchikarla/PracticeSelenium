package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Sorting s=new Sorting();
		s.sorting();
				
		
	}
	public void sorting()
	{
	
		String inputString="srikanth";
		char tempArray[]=inputString.toCharArray();
		Arrays.sort(tempArray);
		System.out.println(new String(tempArray));
		
		
	}

}
