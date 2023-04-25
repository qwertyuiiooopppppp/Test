package ex01;
// 인터페이스 선언 // 인터페이스는 추상메소드만 가능
public interface RemoteControl {

	//추상메소드 - body없음
	public void trunon(); 
	public void trunoff(); 
	
	
	// 디폴트 메서드 -- 인터페이스에서 사용, 구현클래스에서 재정의 선택 가능, 하위클래스가 구현해도되고 안해도됨
	default void setMute(boolean mute) {  // 함수는 안됨
		if( mute)
			System.out.println(" 무음처리 합니다.");
		else
			System.out.println(" 무음처리 해제합니다.");
			
	}
	// 정적메소드
	public static void changeBattry() { //public 생략가능
		System.out.println(" 건전지를 교체합니다");
	}

	}


