package oop;

class A{
	protected static void test(){
		System.out.println("protected static method in A");
	}
	void test(String test){
		System.out.println("overload static method test() in A with test msg: "+test);
	}
}

class B extends A{
	//public void test(){} - This instance method cannot override the static method from A
	//public static void test(String test){} This static method cannot hide the instance method from A
	public static void test(){
		System.out.println("override the protected static void test() method in B with public modificator");
	}
	public void test(String test){
		System.out.println("override the default void test(String test) method in B with public modificator "+test);
	}
}

public class TestStaticOverloadMethod {

	public static void main(String[] args) {
		A a=new A();
		A.test();
		a.test("ONLY Object A");
		System.out.println("----------");
		B b=new B();
		B.test();
		b.test("ONLY Object B");
		System.out.println("-----------");
		A ab=new B();
		ab.test("ONLY Object A ab=new B");
		System.out.println("-----------");
		//B ba=(B)new A(); - java.lang.ClassCastException: oop.A cannot be cast to oop.B
	}
}
