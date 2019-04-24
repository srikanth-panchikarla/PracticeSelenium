package ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx {

	public static void main(String[] args) {

		ComparatorEx co = new ComparatorEx();
		co.sorting();
	}

	public void sorting() {
		Integer str1 = 1001;
		Integer str2 = 201;
		Integer str3 = 1;

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(str1);
		list.add(str2);
		list.add(str3);
		System.out.println("Before Sort: "+ list);
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		
		System.out.println("After Sort: "+ list);

	}

}
