package multithteads;

public class ThreadClass extends Thread {
	public ThreadClass() {
	}

	public ThreadClass(String target) {
		super(target);
		System.out.println(target + " will running");
	}

	@Override
	public void run() {
		System.out.println("ThreadClass run() method " + "Thread name is: " + this.getName());
	}
}
