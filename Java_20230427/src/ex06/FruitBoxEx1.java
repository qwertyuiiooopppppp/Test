package ex06;

import java.util.ArrayList;

class Fruit               { public String toStoring () { return "Fruit";}}
class Apple extends Fruit { public String toStoring () { return "Apple";}}
class Grape extends Fruit { public String toStoring () { return "Frape";}}
class Toy                 { public String toStoring () { return "Toy";}}

public class FruitBoxEx1 {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> ToyBox = new Box<Toy>();
		
		fruitBox.add( new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
	//	appleBox.add(new Grape());  에러 Box<Apple>에는 apple만 담을 수 있음
		
		ToyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(ToyBox);
		

	}

}
class Box<T>{
	ArrayList<T> List = new ArrayList<T>();
	void add (T item) {List.add(item);}
	T get( int i) {return List.get(i);}
	int size() { return List.size();	}
	
	public String toString() {return List.toString();}
}
