package ex02;

public class A {
	
	// 중첩클래스
	class B {
		int field =1; // 멤버변수 , 인스턴스변수
		void test() {} // 멤버함수, 인스턴스메서드
		
	// 17버전부터 허용	
	//	static int field2 =1; // 정적변수, 정적클래스
	//  static void test2 () {} // 정적메서드 	
		B() {
		System.out.println(" B 객체생성");
	}
	}
	
	class C {
		C (){
			System.out.println(" C 객체 생성");
		}
	}
	B fieled = new B ();
	C fields = new C ();
	
	A(){
		B b = new B ();
		System.out.println("A 객체 생성");
		
	}
	 void method() {
		 B b = new B ();
	 }
}
