package comparator_comparable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student1 {

	public static void main(String[] args) {
		
		
	
		
		Map<Integer, Student12> mp = new HashMap<>();
		
		
		ArrayList<Student12> ls=new ArrayList<>();
		
		  // Generate 30 students with random marks and calculate total + result
        for (int i = 1; i <= 30; i++) {
            int social = getRandomMarks();
            int math = getRandomMarks();
            int hindi = getRandomMarks();
            int science = getRandomMarks();
            int maithili = getRandomMarks();

            int totalMarks = social + math + hindi + science + maithili;
            String result = getResult(totalMarks);

            Student12 s = new Student12(i, "Student" + i, result, totalMarks, social, math, hindi, science, maithili);
            ls.add(s);
            mp.put(i, s);
        }

      
        
        System.out.println(mp.values());
        System.out.println();
        for (Student12 s : ls) {
            System.out.println(s);
        }
    }

    public static int getRandomMarks() {
        return (int) (Math.random() * 100); // 0 to 99
    }

    public static String getResult(int total) {
        if (total >= 300) return "First Class";
        else if (total >= 250) return "Second Class";
        else if (total >= 200) return "Third Class";
        else return "Fail";
    }
		
		

	}


class Student12 {
	int roll;
	String name;
	String result;
	int totalMarks;
	int social;
	int math;
	int hindi;
	int science;
	int maithili;

	public Student12(int roll, String name, String result, int totalMarks, int social, int math, int hindi, int science,
			int maithili) {
		this.roll = roll;
		this.name = name;
		this.result = result;
		this.totalMarks = totalMarks;
		this.social = social;
		this.math = math;
		this.hindi = hindi;
		this.science = science;
		this.maithili = maithili;
	}

	@Override
	public String toString() {
		return "Student12 [roll=" + roll + ", name=" + name + ", result=" + result + ", totalMarks=" + totalMarks
				+ ", social=" + social + ", math=" + math + ", hindi=" + hindi + ", science=" + science + ", maithili="
				+ maithili + "]";
	}

}
