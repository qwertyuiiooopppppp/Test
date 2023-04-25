package ex06;

public class Car {
	private Tire tire = new Tire();
	                    // 익명자식객체 -> 부모클래스 상속받아 아래같이 생성됨
	private Tire tire2 = new Tire() { // 타이어가 가지고 있는 roll 접근 안됨
		public void roll () {
			System.out.println("익명 자식 Tire 객체1이 굴러감");
		}
		public void test () { // 접근못함 
			System.out.println("익명자식 test");
	};

	public void run1 () {
		tire.roll (); //타이어가굴려갑니다
		tire2.roll ();
	}
	public void run2 () {
		Tire tire = new Tire () {
			
			public void roll () {
				System.out.println("익명 자식 Tire 객체2가 굴러감"); //재정의
			}
		};
			tire.roll ();
		}
			public void run3(Tire tire) { tire.roll(); }
			
	
	}
}

