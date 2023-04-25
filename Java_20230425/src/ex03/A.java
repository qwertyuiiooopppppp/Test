package ex03;

public class A {
	
	// 중첩클래스
	static class B {
		B() {
		System.out.println(" B 객체생성");
	}
	}
	
	static class C {
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
	 
	 static void method2() {
		 B b  = new B ();
	 }
}
