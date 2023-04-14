package ex01;

public class Exam02 {
//실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수작성.
	public static void main(String[] args) {
		System.out.println(" 프로그램 시작");
		
		//함수 어떻게 전달?
		add(10,20);
		convertInt(10.9);
		System.out.println(" 프로그램 끝" + " , " );
		
		 
		 }
	
	static void add ( int num1, int num2) {
		System.out.println("더하기 : " + (num1+num2));
}
	static void convertInt (double f) { 
		 System.out.println((int)f);
	 }
}

