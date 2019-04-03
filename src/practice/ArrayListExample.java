package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ArrayListExample {

	public static void main(String[] args) {
	
ArrayList arr= new ArrayList<String>();
arr.add("Monday");
arr.add("Tuesday");
arr.add("Wednesday");
arr.add("Wednesday");
arr.add("Monday");
arr.add("Monday");
arr.add("Monday");
System.out.println(arr);


//Set<String> myset= new HashSet<String>(arr);
//HashSet<String> myset= new HashSet<String>(arr);
//LinkedHashSet<String> myset = new LinkedHashSet<String>(arr);
Set<String> myset=new TreeSet<String>(arr);
System.out.println("Removed duplicate:" +myset);


	}

}
