package strings;

public class TestEqualString {

	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		String s3 = "ABC";
		String s4 = "ABC";
		System.out.println(s1 == s2); // false
		System.out.println(s3 == s4); // true. Т.к. один набор литералов будет
										// указывать на одну область памяти
		System.out.println(s1.equals(s2)); // true
	}
}
