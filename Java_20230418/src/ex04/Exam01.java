package ex04;

class Member{
	private String name; // private 붙으면 패키지안에서만 사용가능(외부접근불가)
	private int age;
	// 디폴드 생성자는 자바가 직접 생성한다. 다만, 개발자가 생성자를 생성하지 않는 경우에만 만들어진다 
	//생성자==>반환 타입이 없음, 클래스이름과 같다, 오버로딩이 가능하다, 초기화 기능을 가지고 있다 
	
	//this
	//1. 지역변수와 멤버변수가 충돌날때 this를 붙이면 멤버변수를 의미
	//2. 생성자를 찾을때
	public Member(String name, int age) {
		this.name= name;
		this.age=age;
	}
	public Member() {
		this("미정의",1);
		
	}
	Member(String name){
		this(name,1);
	}

		
	
	
 void display() {
	 System.out.println(name+ ","+ age);
	}
 	void setData(String n, int a) {
 		name =n;
 		age=a;
 		
 	}
}

public class Exam01 {

	public static void main(String[] args) {
		
		Member s1= new Member("구본우",26); // string, 정수인 생성자를 찾는다
		
		
//		s1.name ="구본우";
//		s1.age =26;
		
		Member s2= new Member("추명선",26);
//		s2. setData("추명선",26);
		
//		s2.name ="추명선";
//		s2.age =26;
		
		s1.display();
		s2.display();
		
		Member s3 = new Member();
		s3.display();
		
		Member s4 = new Member("이성진");
		s4.display();
	}

}
