package multithteads;
import java.util.*;

public class TestJoinClass implements Runnable {
	@Override
	public void run() {
		System.out.println("JoinClass.run() "
		+ Calendar.getInstance().getTime());
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("afterSleep " + Calendar.getInstance().getTime());
	}
}
