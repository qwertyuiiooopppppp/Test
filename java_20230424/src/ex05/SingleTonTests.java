package ex05;

import java.sql.Date;
import java.util.Calendar;

class Sample {
}

class singleton{
	private static singleton instance;
	
	private singleton() {} // (같은 클래스 안에만) 생성자가 private
	
	public static singleton getInstance() {  // 클래스명.함수  // 외부에서 호출시 getInstance 사용하여 객체 생성 반환
		
		if( instance == null)
			instance = new singleton(); 
		    // 주소값가지고있음// 객체 상성
		return instance;
	}
}

public class SingleTonTests {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		System.out.println(s1 ==s2); // 주소값 달라서 false
		System.out.println("--------------");
		
		// singleton sing1 = new singleton(); 에러 //singleton 
		singleton sing1 = singleton.getInstance();
		singleton sing2 = singleton.getInstance();
		System.out.println(sing1 == sing2);
		System.out.println("--------------");
		
		Calendar now = Calendar.getInstance(); //
		System.out.println(Calendar.getInstance().getTime());
		

	}

}
