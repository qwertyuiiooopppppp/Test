package ex04;

enum Scale{
	Do, RE, Mi, FA
}

public class SimpleEnum {

	public static void main(String[] args) {
		System.out.println(Scale.Do.ordinal());
	}

}
