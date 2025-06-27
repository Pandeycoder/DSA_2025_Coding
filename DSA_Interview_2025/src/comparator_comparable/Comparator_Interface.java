package comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_Interface {

	public static void main(String[] args) {

		Student s = new Student(100, "Rahul", 24, 80, 76, 85);

		Student s1 = new Student(105, "Pooja", 24, 80, 76, 92);
		Student s2 = new Student(102, "Punam", 24, 81, 72, 95);
		Student s3 = new Student(101, "Anny", 24, 88, 73, 90);
		Student s4 = new Student(107, "Soni", 24, 82, 74, 85);
		Student s5 = new Student(104, "john", 24, 79, 79, 81);
		
		
		ArrayList<Student> ls=new ArrayList<>();
		ls.add(s);
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		ls.add(s5);
		Collections.sort(ls, new RollComparator());
		Collections.sort(ls, new NameComparator());
		
		for(Student s11 : ls)
		{
			System.out.println(" "+s11);
		}

	}

}

class Student {

	int roll;
	String name;
	int age;
	int math;
	int science;
	int english;

	public Student(int roll, String name, int age, int math, int english, int science) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public String toString() { 
		return +roll + "  " + name + "    " + age + "    " + math + "   " + english + "   " + science;

	}
}

class RollComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		if (s1.roll > s2.roll) {
			return 1;
		} else if (s1.roll < s2.roll) {
			return -1;
		} else {
			return 0;
		}
	}
}

class MathComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		if (s1.math > s2.math) {
			return 1;
		} else if (s1.math < s2.math) {
			return -1;
		} else {
			return 0;
		}
	}
}

class NameComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		
		return s1.name.compareTo(s2.name);
	}
}
