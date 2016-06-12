package exceptions;

import java.io.*;

public class SampleTestExceptionIerarchy {
	public static void main(String... args) {
		ioExcAndFileNotFoundEx();
	}

	public static void ioExcAndFileNotFoundEx() {
		try {
			String x = "abc";
			if (x.equals("abc")) {
				throw new IOException();
			} else {
				throw new FileNotFoundException();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
