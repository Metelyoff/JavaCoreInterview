package dataTypes_variables_operators_loops_arrays;

public class TestDefaultValues {
	int i;
	double d;
	float f;
	char c;
	String s;
	Object o;
	boolean b;

	public String toString() {
		return "TestClass{" 
				+ "int=" + i 
				+ ", double=" + d
				+ ", float=" + f
				+ ", char=" + c
				+ ", String=" + s 
				+ ", Object=" + o 
				+ ", boolean=" + b + '}';
	}

	public static void main(String[] args) {
		TestDefaultValues tdv = new TestDefaultValues();
		System.out.println(tdv.toString());
	}

}
