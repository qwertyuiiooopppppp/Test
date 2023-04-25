package ex05;
// 중첩 인터페이스
// 해당 클래스와 밀접관계를 맺는 구현 객체를 만들기 위해서다ㅣ
public class Button {
	
	public static interface ClickListener{// 버튼 인터페이스
		void onClick();
	}
	private ClickListener ClickListener;
	                       //여기에 넘긴다
	public void setClickListener(ClickListener ClickListener) {
		                         // 인터페이스 구현한 갹체 주소값을 
		this.ClickListener = ClickListener;
	}
	public void chlick () { // 버튼이 클릭되었을때 실행되는 메소드 선언 
		this.ClickListener.onClick();
	}
	
	}


