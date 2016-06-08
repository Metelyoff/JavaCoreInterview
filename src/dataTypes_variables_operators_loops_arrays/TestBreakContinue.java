package dataTypes_variables_operators_loops_arrays;

public class TestBreakContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 2) {
					System.out.println("#A# i: " + i + " j: " + j + " break (end j loop). Will not see #C#");
					break;
				}
				if (j == 1) {
					System.out.println("#B# i: " + i + " j: " + j + " continue (j++).Will not see #C#");
					continue;
				}
				System.out.println("#C# i: " + i + " j: " + j);
			}
		}
	}
}
