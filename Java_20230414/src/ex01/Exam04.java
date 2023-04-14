package ex01;

public class Exam04 {
// 호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력
	public static void main(String[] args) {
		System.out.println(" 프로그램 시작");
		
		//함수 어떻게 전달?
		int num = add();
		System.out.println(num);
		
		double df = convertInt();
		System.out.println((int)df);
		
		System.out.println(" 프로그램 끝" + " , " );
	}
	
	static double convertInt() {    
		return 10.2;
	}
		   static int add(){
			   int i =10+20;
			   return i;
		   }
	

	}
