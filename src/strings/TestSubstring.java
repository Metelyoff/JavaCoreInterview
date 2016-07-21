package strings;

public class TestSubstring {

	public static void main(String[] args) {
		String fs = "123456789";
		String sub = fs.subSequence(3, 6).toString();
		String sub2 = fs.substring(3, 6);
		System.out.println(sub2); // 456
	}
}
