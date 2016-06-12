package multithteads;

import java.util.*;

public class TestJoinClassDemo {
	public static void main(String[] args) {
		Thread threadExample = new Thread(new TestJoinClass());
		threadExample.start();
		try {
			threadExample.join(); // public static void TestClass.main() connect
									// to threadExample and wait it.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("END: " + Calendar.getInstance().getTime());
	}
}
