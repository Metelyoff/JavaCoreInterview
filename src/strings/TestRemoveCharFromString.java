package strings;

public class TestRemoveCharFromString {

	public static String removeChar(String str, char ch) {
		if (str == null)
			return null;
		return str.replaceAll(Character.toString(ch), "");
	}

	public static void main(String[] args) {
		String name = "Name";
		System.out.println("String name before remove char from string: " + name);
		name = removeChar(name, 'N');
		System.out.println("String name before remove char from string: " + name);
	}
}
