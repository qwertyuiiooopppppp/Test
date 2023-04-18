package ex05;
class 사람{
	String name;
	int age;
	public 사람(String name, int age) {
		this.name = name;
		this.age= age;
	}
	
	void info() {
		System.out.println(name + ","+ age);
	}
}
class 구본우 extends 사람{
	double weight;
	
	public 구본우() {
		super ("구본우",29);
	}
	
	public 구본우(String name, int age, double weight) {
		super(name,age);
		this. weight = weight;
	}
	
	void display() {
//		System.out.println(name + "," + age + weight);
	}
}
class 추명선 extends 사람{
	double height;
	
	public 추명선(String name, int age, double height) {
		super (name, age);
		this. height = height;
	}
//	public 추명선(String name, int age, double height) {
//		this.name= name;
//		this.age=age;
//		this.height=height;
//	}
	
	void display() {
//		System.out.println(name + "," + age + height);
	}	
}
class 박종진{
	String grade; // 학점
	
//	public 박종진(String name, int age, String grade) {
//		this.name= name;
//   	this.age=age;
//		this.grade=grade;
// }
	void display() {
//		System.out.println(name + "," + age + weight);
	}
}
public class studentExam {

	public static void main(String[] args) {
		
		구본우 구 = new 구본우("로이",11,120);
		구.info();
		
     	추명선 추 =new 추명선("라라",5,10);
		추.info();
	}
		
}
