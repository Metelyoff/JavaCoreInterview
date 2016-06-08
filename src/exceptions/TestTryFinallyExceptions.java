package exceptions;

public class TestTryFinallyExceptions
{
	public static void main(String[] args) {
		Exception ex = twoExceptionsMethod();
		System.out.println(ex.getClass());
		String s = twoExceptionsMethod2();
		System.out.println(s);
	}
	public static Exception twoExceptionsMethod() {
		try {
			return new IndexOutOfBoundsException();
		} finally {
			return new NullPointerException();
		}
	}
	public static String twoExceptionsMethod2() {
		try {
			throw new NullPointerException();
		}catch (NullPointerException ex) {
			System.out.println(ex.getMessage()+ " catch");
		}
		finally {
			Exception ex2 = new Exception();
			return ex2.getMessage() + " finally";
		}
	}
}

