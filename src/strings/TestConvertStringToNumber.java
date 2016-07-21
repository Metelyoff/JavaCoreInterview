package strings;

public class TestConvertStringToNumber {
	public static void main(String[] args) {
		String x = "523.5";
		Double xd = Double.valueOf(x);
		/*
		 * Integer xy = Integer.valueOf(x); //java.lang.NumberFormatException:
		 * For input string: "523.5"
		 */
		System.out.println(xd); // 523.5
	}
}
