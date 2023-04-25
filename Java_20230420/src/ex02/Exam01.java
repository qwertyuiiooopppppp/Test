package ex02;

class A{
	int a=10;
	void func() {
		System.out.println(" A - a : " +a);
	}
	}
	
class B extends A{
	int a =20;
	void func2 () {
		System.out.println("B- a " + a);
	}
}
public class Exam01 {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
		b. func();
		b. func2();
		System.out.println("-----------");
		b.func();
		
		System.out.println(b.toString());
		
		
		
		
		Object oa= new A();
		Object ob= new B();
		System.out.println(oa.toString());
		System.out.println(ob.toString());
		

	}

}
