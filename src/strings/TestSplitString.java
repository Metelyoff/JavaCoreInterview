package strings;

import java.util.Arrays;

public class TestSplitString {

	public static void main(String[] args) {
		String line = "I am a java developer";
		String[] words = line.split(" ");
		String[] twoWords = line.split(" ", 2);
		// String split with delimiter: [I, am, a, java, developer]
		System.out.println("String split with delimiter: " + Arrays.toString(words));
		// String split into two: [I, am a java developer]
		System.out.println("String split into two: " + Arrays.toString(twoWords));
		// split string delimited with special characters
		String wordsWithNumbers = "I|am|a|java|developer";
		String[] numbers = wordsWithNumbers.split("\\|");
		// String split with special character: [I, am, a, java, developer]
		System.out.println("String split with special character: " + Arrays.toString(numbers));
	}
}
