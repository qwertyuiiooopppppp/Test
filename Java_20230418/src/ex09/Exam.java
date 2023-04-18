package ex09;

 class parent {                   //생성전 // name을 super에 입력
	public String name;
	
	public parent(String name) {
		this.name = name;
	}
}
 class child extends parent {         // 생성후
	public int studentNo;
	
	public child (String name, int studentNo) {
		super(name);
		this. studentNo = studentNo;
}
 }
public class Exam {

	public static void main(String[] args) {
		
		child ch= new child("라라",3);
	}

	}


