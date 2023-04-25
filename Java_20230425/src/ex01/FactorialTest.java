package ex01;
// 재귀함수

public class FactorialTest {

	public static void main(String[] args) {
		System.out.println(factorial(5));
                           //120
	}
	static int factorial(int n) { //5 //4
		int result =0;
		
		if(n==1)
			return 1;
		
		else 
			result = n*factorial(n-1); //4 이상태에서 함수 호출
		    //120
		  return result;
	}
}
