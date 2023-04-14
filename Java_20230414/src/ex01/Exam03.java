package ex01;

public class Exam03 {
//더하기: 반환타입 O, 매개변수 x
	public static void main(String[] args) {
		System.out.println(" 프로그램 시작");
		
		//함수 어떻게 전달?
		int num = add();
		System.out.println(num);
		System.out.println(" 프로그램 끝" + " , " );
	}
		   static int add(){
			   int i =10+20;
			   return i;
		   }
	

	}


