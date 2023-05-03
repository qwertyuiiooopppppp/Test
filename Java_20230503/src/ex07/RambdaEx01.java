package ex07;

interface MyFunction {
	int square (int x); //추상메서드
}

public class RambdaEx01 {

	public static void main(String[] args) {
		MyFunction m = x -> x*x;
		
		System.out.println("sqare : " + m.square(10));
		

	}

}
