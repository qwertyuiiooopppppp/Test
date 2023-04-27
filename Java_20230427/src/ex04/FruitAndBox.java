package ex04;


class Apple{ // 사과
	public String toSting() {
		return " I am an apple";
	}
}
class Orange{ // 오렌지
	public String toString () {
		return " I am an orange";
	}
}
class Box<T>{ // 사과 오렌지 담는 박스  // T는 정해져있지않다
	private T obj;

	public T getobj() {
		return obj;
	}

	public void setobj(T obj) {
		this.obj = obj;
	}
}


public class FruitAndBox {

	public static void main(String[] args) {
		
		Box <Apple>aBox = new Box<Apple>(); // 사과
		Box <Orange>oBox = new Box<Orange>(); // 오렌지
		
		//aBox.setobj(new Apple());
		
		aBox.setobj(new Apple()); // 사과 저장
		oBox.setobj(new Orange()); // 어렌지 저장
		
		Apple ap= aBox.getobj(); //꺼내기 
		Orange op= oBox.getobj();	
		System.out.println(ap);
        System.out.println(op);
		
//		System.out.println(aBox.getobj());
//		System.out.println(oBox.getobj());

	}

}
