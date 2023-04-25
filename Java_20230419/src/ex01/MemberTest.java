package ex01;

class Bag {
	int canacity; // 용량
	SunCream sun; // 포함관계
	
	public Bag () {
		System.out.println("Bag ()");
	}
    void move() {
    	System.out.println("가방 옮기다");
    };
    
    
}

class SunCream {   //선크림은 생성자가 없음, 객체도 없으 
	int vol;
	public SunCream() {
		System.out.println( "SunCream()");
	}
	void cover() {
		System.out.println("선크림 바르다.");
	}
}
public class MemberTest {

	public static void main(String[] args) {
		 
		Bag bg = new Bag();
		
		bg.sun = new SunCream();
		bg.move();
		bg.sun.cover();
	}

}
