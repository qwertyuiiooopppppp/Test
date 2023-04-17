package ex05;

class Member{
	
	//함수이름 같음, 매개변수 개수, 타입 달라야함
	int func(int n) {
		System.out.println("int");
		return n;
	}
	double func(double d) {
		System.out.println("double");
		return d;
	}
	String func(String str) {
		System.out.println("String");
		return str;
	}
	int func (int n1, int n2) {
		System.out.println("int int");
		System.out.println(n1+n2);
		return n1+n2;
	}
}

public class Exam01 {

	public static void main(String[] args) {
		Member m = new Member();
		
		System.out.println(m.func(10,2));

	}

}
