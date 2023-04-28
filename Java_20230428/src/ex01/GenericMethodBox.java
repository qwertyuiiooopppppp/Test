package ex01;

class Box{
	private Integer ob;
	public Integer getOb() {
		return ob;
	}
	public void setOb(Integer ob) {         // box.setOb() integer만 들어갈수잇음
		this.ob= ob;
	}
}
class Unboxer {
	public static Integer openBox(Box box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box box = new Box();
		box.setOb(123);
		Integer tmp = Unboxer.openBox(box).intValue();
		
		//Unbox 클래스 openbox 이용해서 ob를 꺼내서 변수에 담아서 출력해보자 
		System.out.println(tmp);
	}

}
//object 바꿨을때 타입형변환
//box.setOb(123);
//int tmp = (Integer)Unboxer.openBox(box);
//System.out.println(tmp)

