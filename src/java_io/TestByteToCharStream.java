package java_io;

import java.io.*;

public class TestByteToCharStream {
	public static void main(String[] args) {
		OutputStream outputStream = null;
		Writer outputStreamWriter = null;

		InputStream inputStream = null;
		Reader inputStreamReader = null;
		try {
			outputStream = new FileOutputStream(
					"/storage/emulated/0/AppProjects/JavaCoreInterview/src/java_io/output.txt");
			outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
			outputStreamWriter.write("Hello World");

			inputStream = new FileInputStream(
					"/storage/emulated/0/AppProjects/JavaCoreInterview/src/java_io/output.txt");
			inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
			int data = inputStreamReader.read();
			while (data != 1) {
				char theChar = (char) data;
				data = inputStreamReader.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("can not found file" + e);
		} catch (IOException e) {
			System.out.println("can not write " + e);
		} finally {
			try {
				outputStreamWriter.close();
				inputStreamReader.close();
			} catch (IOException e) {
				System.out.println("Can not close file");
			}
		}
	}
}
