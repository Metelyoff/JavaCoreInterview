package oop;

class Constructors {
	
	private int id;
	private String name;
	
	Constructors() {
		System.out.println("Default construcor");
	}
	Constructors(Constructors c){//конструктор копирования
		this.id=c.id;
		this.name=c.name;
		System.out.println("---"+c.toString()+"---");
	}
	Constructors(int id, String name){//конструктор с параметрами
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class TestConstructor{
	public static void main(String args[]){
		Constructors test1=new Constructors();
		Constructors test2=new Constructors(test1);
		Constructors test3=new Constructors(3,"test3");
		Constructors test4=new Constructors(test3);
		
		System.out.println("Test1 constructor without arguments"+"\n"+test1.toString());
		System.out.println("Test2 constructor with clone Test1"+"\n"+test2.toString());
		System.out.println("Test3 constructor with arguments="+test3.getId()+", "+test3.getName()+"\n"+test3.toString());
		System.out.println("Test4 constructor with clone Test3"+"\n"+test4.toString());
	}
}