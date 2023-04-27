package ex05;


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
class Box{ // 사과 오렌지 담는 박스
	private Object obj;

	public Object getobj() {
		return obj;
	}

	public void setobj(Object obj) {
		this.obj = obj;
	}
}


public class FruitAndBox {

	public static void main(String[] args) {
		
		Box aBox = new Box(); // 사과
		Box oBox = new Box(); // 오렌지
		
		//aBox.setobj(new Apple());
		
		aBox.setobj( "Apple"); // 사과 저장
		oBox.setobj( "Orange"); // 어렌지 저장
		
//		Apple ap= ( Apple)aBox.getobj(); //꺼내기 
//		Orange op= (Orange)oBox.getobj();
	
//		System.out.println(ap);
//      System.out.println(op);
		
		System.out.println(aBox.getobj());
		System.out.println(oBox.getobj());

	}

}
