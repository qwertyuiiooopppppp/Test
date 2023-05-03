package ex04;

enum Animal {
	DOG, CAT
}
enum Person2{
	MAN, WOMAN
}

public class SimpleEnum2 {

	public static void main(String[] args) {
		
		who(Person2.MAN);
		// Who(Animal.CAT);
		
		
	}
	
	public static void who(Person2 p) {
		switch(p) {
		case MAN :
			System.out.println("남성");
			break;
		case WOMAN :
			System.out.println("여성");
			break;
		}
	}
}
	


