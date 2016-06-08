package dataTypes_variables_operators_loops_arrays;

public class TypeConverterExample {
	public static void typeConverterExampleMethod() {
		long a = 100L;
		double b = 300.0;
		Object ab = a + b;
		System.out.println(ab.getClass().getName() + " value: " + ab); // java.lang.Double
																		// value:
																		// 400.0
		double c = 1000.05;
		long d = 1000;
		Object cd = c + d;
		System.out.println(cd.getClass().getName() + " value: " + cd);// java.lang.Double
																		// value:
																		// 2000.05
	}

	public static void typeNarrowing() {
		int a0 = 64;
		int a = 257;
		int a2 = 126;
		int a3 = 129;
		byte b0 = (byte) a0;
		byte b = (byte) a;
		byte b2 = (byte) a2;
		byte b3 = (byte) a3;
		System.out.println(b0 + " " + b + " " + b2 + " " + b3); // 64 1 126 ­127
		double c = 56.9876;
		int d = (int) c;
		System.out.println(d); // 56
		long e = 1000L;
		float f = (float) e;
		System.out.println(f); // 1000.0
	}

	public static void getDoubleAndLong() {
		long a = 100L;
		double b = a;
		Object ab = a + b;
		System.out.println(ab.getClass().getName() + " value: " + ab); // java.lang.Double
																		// value:
																		// 200.0
		float c = 100;
		long d = 1000;
		Object cd = c - d;
		System.out.println(cd.getClass().getName() + " value: " + cd);// java.lang.Float
																		// value:
																		// ­900.0
	}

	public static void main(String args[]) {
		typeConverterExampleMethod();
		typeNarrowing();
		getDoubleAndLong();
	}
}
