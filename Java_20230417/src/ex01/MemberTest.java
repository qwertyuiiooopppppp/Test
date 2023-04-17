package ex01;

class Member{

	String name;
	String id; //인스턴스변수..변수/멤버변수
	String password;
	int age;
	

	// 인스턴스메소드
	boolean login(String id, String pw) { //지역변수
		
		if(id.equals("홍길동") && pw.equals("12345"))
			return true;
		else return false;
	}
	// 인스턴스메소드
	void logout(String id) { // 인스턴스메소드
		 System.out.println(id+ "님 로그아웃되었습니다.");
	}
}
public class MemberTest {

	public static void main(String[] args) {
		Member m =new Member();
		
		Boolean b=m.login("로이", "1234");
		if(b==true)
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		
		Boolean b2 =m.login("홍길동", "12345");
		
		if(b2==true)
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		
		m.logout("홍길동");
	}

	}

