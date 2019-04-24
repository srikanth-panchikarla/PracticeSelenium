package ComparableExample;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableProgram {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(323, "Srikanth", 32));
		list.add(new Student(32, "James", 22));
		list.add(new Student(31, "Henry", 67));

		Collections.sort(list);

		for (Student st : list) {
			System.out.println("Sorted list:" + st.rollno);

		}
	}

}
