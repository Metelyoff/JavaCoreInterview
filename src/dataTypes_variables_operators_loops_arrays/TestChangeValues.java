package dataTypes_variables_operators_loops_arrays;

import java.util.ArrayList;

public class TestChangeValues {

	public ArrayList<Object> changeObjectValue(ArrayList<Object> objectValue) {
		objectValue.clear();
		objectValue.add(999);
		return objectValue;
	}

	public String changeStr(String str) {
		str = "NewString";
		return str;
	}

	public int changeX(int x) {
		x = x * 5;
		return x;
	}

	public static void main(String[] args) {
		TestChangeValues testClass = new TestChangeValues();
		ArrayList<Object> value = new ArrayList<Object>();
		value.add(23);
		String str = "FirstString";
		int x = 2;
		System.out.println(value + " " + str + " " + x); // [23] FirstString 2
		ArrayList<Object> value2 = new ArrayList<Object>();
		value2 = value;
		value2 = testClass.changeObjectValue(value2);
		String str2 = str;
		str2 = testClass.changeStr(str2);
		int x2 = testClass.changeX(x);
		System.out.println(value + " " + str + " " + x); // [999] FirstString 2
		System.out.println(value2 + " " + str2 + " " + x2); // [999] NewString
															// 10
		System.out.println(value.equals(value2) + " " + str.equals(str2) + " " + (x2 == x)); // true
																								// false
																								// false
	}
}
