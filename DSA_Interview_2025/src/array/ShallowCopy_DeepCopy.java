package array;

public class ShallowCopy_DeepCopy {
	
	
	Student s1=new Student();
	

}

class Student
{
	String name;
	int roll;
	String password;
	int marks[];
	
	
	// Shallow Copy constructor(copy object reference)
	
//	Student(Student s1)
//	{
//		marks=new int[3];
//		this.name=s1.name;
//		this.roll=s1.roll;
//		this.marks=s1.marks; 
//		
//	}
	
	// Deep copy (new array)
	
	Student(Student s1)
	{
		marks=new int[3];
		this.name=s1.name;
		this.roll=s1.roll; 
		
		for(int i=0; i<marks.length; i++)
		{
			this.marks[i]=s1.marks[i];
		}
		
	}
	
}