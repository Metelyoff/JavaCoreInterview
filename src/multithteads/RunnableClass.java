package multithteads;

public class RunnableClass implements Runnable {
	private String localName;
	public RunnableClass() {
	}
	public RunnableClass(String localName) {
		this.localName = localName;
	}
	@Override
	public void run() {
		System.out.println("run() " + localName + " running");
	}
	public String getLocalName() {
		return localName;
		}
	public void setLocalName(String localName) {
		this.localName = localName;
		}
}
