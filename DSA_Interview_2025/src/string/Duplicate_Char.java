package string;

import java.util.HashMap;

public class Duplicate_Char {

	public static void main(String[] args) {

		HashMap<Character, Integer> countDuplicate = countChar("Learn Java Programming");
		System.out.println(countDuplicate);
	}

	public static HashMap<Character, Integer> countChar(String name) {
		HashMap<Character, Integer> count = new HashMap<>();

		char arr[] = name.toCharArray();
		for (char c : arr) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c) + 1);
			} else {
				count.put(c, 1);
			}
		}
		return count;
	}

}
