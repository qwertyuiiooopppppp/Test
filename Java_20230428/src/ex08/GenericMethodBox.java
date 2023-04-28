package ex08;

class A{   }

class B extends A {  }

class C extends B {  }

class Box<T > { 
	private T ob;
	
	public T getOb() {
		return ob;
	}
	
	
	public void setOb(T ob) {       
		this.ob= ob;
	}
}

class Unboxer{                     // ? 모든게 다 들어올수있음 제한을 걸어놨으니 B 상속하는애들만 옴
	public static void peekBox(Box< ? extends B > box) { //상한 제한
		System.out.println(box.getOb());
	}
}
public class GenericMethodBox {

	public static void main(String[] args) {
		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>(); // b 아래만 가능
		Box<C> cBox = new Box<>(); // c 아래만 가능

	//	Unboxer.peekBox(aBox);
		Unboxer.peekBox(bBox); //peekBox 박스타입만 들어갈수있음
		Unboxer.peekBox(bBox);
		
}
}
