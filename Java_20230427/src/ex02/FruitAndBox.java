package ex02;

class Apple{ // 사과
	public String toSting() {
		return " I am an apple";
	}
}
class orange{ // 오렌지
	public String toString () {
		return " I am an orange";
	}
}
class AppleBox{ // 사과 담는 박스
	private Apple ap;

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
}

class OrangeBox{ // 오렌지 담는 박스 
	private orange or;

	public orange getOr() {
		return or;
	}

	public void setOr(orange or) {
		this.or = or;
	}
}
public class FruitAndBox {

	public static void main(String[] args) {
		
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.setAp(new Apple());
		oBox.setOr(new orange());
		
	    Apple a = aBox.getAp();
	    orange o = oBox.getOr();
	    System.out.println(a);
	    System.out.println(o);
	    

	}

}
