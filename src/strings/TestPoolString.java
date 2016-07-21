package strings;

public class TestPoolString {

	public static void main(String[] args) {
		String cat1 = "Cat";
		String cat2 = "Cat";
		String cat3 = new String("Cat");
		System.out.println("\"Cat\" == \"Cat\" :" + (cat1 == cat2)); // s1 == s2
																		// :true
		System.out.println("\"Cat\" == new \"Cat\" :" + (cat1 == cat3)); // s1
																			// ==
																			// s3
																			// :false
	}
}
