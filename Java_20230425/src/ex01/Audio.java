package ex01;

public class Audio implements RemoteControl {

	@Override
	public void trunon() {
	
	System.out.println("오디오를 켭니다.");
	
	}

	@Override
	public void trunoff() {
		System.out.println(" 오디오를 끕니다.");
	}
	public void setMute(boolean mute) {
		System.out.println("setMute() 재정의합니다.");
	}
	
	

}
