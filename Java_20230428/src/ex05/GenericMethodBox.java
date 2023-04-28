package ex05; //ABC 상속


class A{}
class B extends A{}
class c extends B{}

class Box<T extends A> { 
	private T ob;
	
	public T getOb() {
		return ob;
	}
	
	
	public void setOb(T ob) {       
		this.ob= ob;
	}
}
class Unboxer {
	public static<T  extends A> T openBox(Box<T> box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
	
		Box<c> cBox = new Box<c>();
		
		Box<B> bBox = new Box<B> ();
		
		Box<A> aBox = new Box<A>();
		//Box<A> aaBox = new Box<B>(); error;  상속해도 타입 불일치하면 에러 

	}

}

