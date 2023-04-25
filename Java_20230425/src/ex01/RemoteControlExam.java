package ex01;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		RemoteControl rc = new Television();
		rc. trunon();
		
		rc= new Audio();
		rc. trunon();
		rc.setMute(true);
		
		Television tel = new Television();
		tel.search(null);
		
		Television se = new Television();
		se.search(null);
		
		
		RemoteControl.changeBattry();
		
		

	}

}
