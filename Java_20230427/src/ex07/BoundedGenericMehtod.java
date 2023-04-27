package ex07;


class Box<T>{          //Tㅇ에 integer
	private T ob;
	public void set( T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}
class BoxFacotry{                                     //7
	public static < T extends Number> Box <T> makeBox(T o){ //T 타입 제한 ,numer(정수,실수)이거나 number 상속받는애들 String X
	//	public static Box <T> makeBox(T o){ // 모든값 
		Box<T> box = new Box<T>();
		box.set(o);
		                                       // 정숧
		System.out.println("Boxed Data :" + o. intValue());
		return box; // box : ob주소값 ex)0X10
	}
}

class Unboxer{                                       //0X10
	public static<T extends Number> T openBox(Box<T> box) {
	System.out.println("Unboxed Data: " + box.get(). intValue());
	return box.get();
}
}
public class BoundedGenericMehtod {

	public static void main(String[] args) {
                    //0X10		
		Box<Integer> sBox = BoxFacotry.makeBox( new Integer(7)); //integer니까 가능 13호출
		int n = Unboxer.openBox(sBox);
		System.out.println("n: " +n);
	}

	}


