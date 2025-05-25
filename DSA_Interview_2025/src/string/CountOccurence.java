package string;

import java.util.HashMap;

public class CountOccurence {

	public static void main(String[] args) {

		HashMap<String, Integer> countOcc = countOccurence("Test Automation Java Automation Test");

		System.out.println("count Occurence " + countOcc);
	}

	public static HashMap<String, Integer> countOccurence(String name) {

		HashMap<String, Integer> countOcc = new HashMap<>();

		for (String s : name.split(" ")) {
			if (countOcc.containsKey(s)) {
				countOcc.put(s, countOcc.get(s) + 1);
			} else {
				countOcc.put(s, 1);
			}

		}
		return countOcc;
	}

}
