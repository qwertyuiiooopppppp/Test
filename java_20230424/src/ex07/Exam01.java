package ex07;

interface Animal {
	void eat();
	public abstract void sleep();
}

class Cat implements Animal {
	
	public void eat () {
		System.out.println(" 고양이는 먹는다");
	}
	public void sleep () {
		System.out.println(" 고양이는 잔다");
	}
}
class Dog implements Animal {
	
	public void eat() {
		System.out.println(" 강아지는 먹는다.");
	}
	public void sleep() {
		System.out.println(" 강아지는 잔다.");
}
}
public class Exam01 {

	public static void main(String[] args) {
		
	//	Dog.dag = new Dog();
	//	dog.eat();
	// dog. sleep();
		
		Animal an = new Dog();
		an.eat();
		an.sleep();
	}

	}


