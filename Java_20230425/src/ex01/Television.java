package ex01;
// RemoteControl 인터페이스 구현                     //다중상속가능
public class Television implements RemoteControl,Searchable {

	@Override
	public void trunon() {
		System.out.println(" Tv를 켭니다.");
	}

	@Override
	public void trunoff() {
		System.out.println("Tv를 끕니다.");
	}

	@Override
	public void search(String url) {
		System.out.println(url+ " 를 검색합니다.");
	}
	
}
