package ComparableExample;

public class Student implements Comparable<Student> {

	public int rollno;
	public String name;
	public int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;

	}

	@Override
//	public int compareTo(Student stu) {
//		if (age == stu.age) {
//			return 0;
//
//		} else if (age > stu.age) {
//			return 1;
//
//		}
//
//		else
//			return -1;
//
//	}
	
	public int compareTo(Student stu)
	{
		if(rollno==stu.rollno)
		{
			return 0;
			
		}
		else if (rollno>stu.rollno)
			return 1;
		else return -1;
		
	}
}
