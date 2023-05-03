package ex06;

interface MyFunction {
	int max (int a, int b); //추상메서드
}

class MyMax implements  MyFunction{
	
	@Override
	public int max(int a, int b) {
		return a>b ? a:b;
	}
}

public class RambdaEx01 {

	public static void main(String[] args) {
		MyMax m = new MyMax ();
		int num = m.max(10,20);
		System.out.println(num);
		

	}

}
