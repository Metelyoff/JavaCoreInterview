package strings;

public class TestInternString {

	public static void main(String[] args) {
		String a = "string a";
		String new_a = new String("string a");
		String intern_new_a = new_a.intern();
		System.out.println(a == new_a); // false
		System.out.println(new_a == intern_new_a); // false
		System.out.println(a == intern_new_a); // true
	}
}
