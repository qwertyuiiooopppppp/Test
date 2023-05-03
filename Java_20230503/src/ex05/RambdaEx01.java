package ex05;

interface MyFunction {
	int max (int a, int b); //추상메서드
}

public class RambdaEx01 {

	public static void main(String[] args) {
		MyFunction m = new MyFunction() {
			           // 구현객체 (max) 추상메서드를 구현
			@Override
			public int max(int a, int b) {
				return  a> b ? a:b;
			}
		};
		//  람다식
		// 	MyFunction m = (a,b) -> a>b? a:b;
		
		
		System.out.println("max : " + m.max(10,20));
		

	}

}
