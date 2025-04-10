package array;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[] = { 97, 98, 99 };
		int nonChangable = 5;
		update(marks, nonChangable);
		System.out.println(" value nonchangable :  " + nonChangable);

	}

	public static void update(int marks[], int nonChangable) { // call by reference or copy create

		nonChangable = 10;
		for (int i = 0; i < marks.length; i++) {

			marks[i] = marks[i] + 1;
		}
		printMark(marks);
	}

	public static void printMark(int marks[]) {
		for (int i = 0; i < marks.length; i++) {
			System.out.println(" Marks " + (i + 1) + " : " + marks[i]);
		}
	}
}
