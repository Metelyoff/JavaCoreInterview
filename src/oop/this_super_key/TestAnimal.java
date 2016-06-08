package oop.this_super_key;

class Animal {
	public void eat() {
		System.out.println("animal eat");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eat");
	}

	public void thisEat() {
		System.out.println("Call Dog.eat()");
		this.eat();
	}

	public void superEat() {
		System.out.println("Call Animal.eat()");
		super.eat();
	}
}

public class TestAnimal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.thisEat();
		dog.superEat();
	}
}
