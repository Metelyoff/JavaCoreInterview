package java_io;
import java.io.*;

public class DemoSearchFile {
	public static void main(String[] args) {
		File f = null;
		File[] paths;
		try{
			// create new file
			f = new File("/storage/emulated/0/AppProjects/JavaCoreInterview/src/java_io/testFile");
			// returns pathnames for files and directory
			paths = f.listFiles();
			// for each pathname in pathname array
			for(File path:paths){
				// prints file and directory paths
				System.out.println(path);
			}
		}catch(Exception e){
			// if any error occurs
			e.printStackTrace();
		}
	}
	/*
	public boolean accept(File file) {
		if (file.isDirectory()) {
			return true;
		} else {
			String path = file.getAbsolutePath().toLowerCase();
			for (int i = 0, n = extensions.length; i < n; i++) {
				String extension = extensions[i];
				if ((path.endsWith(extension) && (path.charAt(path.length()-extension.length() ­ 1)) == '.')) {
					return true;
				}
			}
		}
		return false;
	}
//OR
	String yourPath = "insert here your path..";
	File directory = new File(yourPath);
	String[] myFiles = directory.list(new FilenameFilter() {
			public boolean accept(File directory, String fileName) {
				return fileName.endsWith(".txt");
			}
		});
		*/
}
