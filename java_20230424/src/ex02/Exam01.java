package ex02;


// 추상클래스 (더 이상 클래스 자체 생성할수없다)
abstract class Animal {
	abstract void makeSound ();  // 추상메소드 상속을 받아서 재정의해서 써라 // 하위클랴스 공통을로 쓰려고
   
	}
	
class Cat extends Animal{  // 공통속성이 있다면 상위클래스 상속 
	Override // 어노테이션( 상위 클래스는 재정의 하겠다는 적극적 표현)
	void makeSound () {
	
	}
}
class Dog extends Animal{
	void makeSound () {
		System.out.println("멍멍~멍멍~");

	}
}
class Pig extends Animal{
	void  makeSound () {
		System.out.println("꿀꿀~꿀꿀~");
	}
}
		
		
class Rabbit extends Animal{
	void makeSound () {
		System.out.println("토끼~ 토끼~");
		}
	}
	public class Exam01 {

	public static void main(String[] args) {
		Animal [] animals = { new Cat(), new Dog(), new Pig(), new Rabbit() };
		
		for( int i = 0; i< animals.length; i++)
			animals[i].makeSound();
		
		           // 단수   // 복수
		for(Animal animal : animals)  // 향상된 for
			animal.makeSound();
		
		Dog d = new Dog();
		d.makeSound();
	}

	}


