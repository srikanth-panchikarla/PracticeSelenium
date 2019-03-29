package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListExample {

	public static void main(String[] args) {
	
ArrayList arr= new ArrayList<String>();
arr.add("Monday");
arr.add("Tuesday");
arr.add("Wednesday");
arr.add("Wednesday");
arr.add("Monday");
arr.add(12);
arr.add("12");
System.out.println(arr);

Set<String> myset= new HashSet<String>(arr);

System.out.println("Removed duplicate:" +myset);


	}

}
