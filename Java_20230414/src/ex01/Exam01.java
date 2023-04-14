package ex01;

public class Exam01 {
/*
 * 
 * 
 * void : 반환타입, main: 함수명, ():매개변수 타입
 * {} : 함수가 수행 문장
 * 
 * 1. 더하기: 반환타입 O, 매개변수 O (2개)
 * 2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수작성.
 */
	           // void :반환타입 존재 하지 않음
	public static void main(String[] args) {
		System.out.println(" 프로그램 시작");
		
	   int num = add(10,20); //add(10,20) 30을 int num이 받아줌
	   int number = convertInt(10.2);
		System.out.println(" 프로그램 끝" + " , " + num+ "num"+ " ,"+number);
		
		
	
	} //convertInt함수를 사용해서 실수값을 가지고 정수로 출력
	 static int convertInt (double f) { 
		 int result = (int)f;
		 return result;
	 }

	        // 함수명    10    20
	static int add(int n1, int n2){ // 매개변수 2개 존재 
		System.out.println("add함수 시작..");
		int result = n1+ n2; //30 22번째줄로 올라감
		return result;
		
		
	}

}
