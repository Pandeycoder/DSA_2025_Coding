package comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Comprable_Interface {

	public static void main(String[] args) {

		Employee e = new Employee(100, "Rahul", 25000, 25);
		Employee e1 = new Employee(104, "Sonu", 35000, 24);
		Employee e2 = new Employee(102, "Monu", 35000, 27);

		Employee e3 = new Employee(105, "Pooja", 25000, 25);
		Employee e4 = new Employee(109, "punam", 35000, 24);
		Employee e5 = new Employee(106, "Preeti", 35000, 27);

		ArrayList<Employee> ob = new ArrayList<>();
		ob.add(e);
		ob.add(e1);
		ob.add(e2);

		ob.add(e3);
		ob.add(e4);
		ob.add(e5);

		Collections.sort(ob);
		System.out.println(" EmpId "+ "  "+"Name");
		for (Employee e11 : ob) {
			System.out.println(" " + e11); 

		}

	}
}

class Employee implements Comparable<Employee> {
	int empId;
	String name;
	int age;
	double salary;

	public Employee(int empId, String name,  double salary,int age) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public int compareTo(Employee e) {
		return this.empId - e.empId;
	}

	@Override
	public String toString() {
		return empId + "  " + name + "    " + salary + "    " + age;
	}
}
