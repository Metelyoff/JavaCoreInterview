package multithteads;

public class TestRunThreads
{
	public static void howToRunThreads() {
		ThreadClass threadClass = new ThreadClass("First");
		threadClass.start(); //method ThreadClass.run()
		Thread thread = new Thread(new RunnableClass("Second"));
		Thread thread2 = new Thread(new RunnableClass("Third"));
		Thread thread3 = new Thread(new RunnableClass("Fourth"));
		thread.start(); //method RunnableClass.run()
		thread2.start(); //method RunnableClass.run()
		thread3.start(); //method RunnableClass.run()
	}
	
	public static void main(String... args){
		howToRunThreads();
	}
}
