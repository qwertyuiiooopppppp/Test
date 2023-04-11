package ex01;

public class Exam09 {

	public static void main(String[] args) {
// int 타입의 변수 num 있을때 각 자리의 합을 더한 결과를
// 출력하는 코드를 완성하라 만일 변수 num의 값이 12345 라면,'1+2+3+4+5' 결과인 15를 출력여야한다
// 문자열로 변환하지말고 숫자로만 처리해야한다
	
				
	int num = 12345; //1+2+3+4+5
	int sum = 0;     
				
	while(num<0) {
		sum += num%10; //5
   		num = num/10;  // 1234
				
		System.out.println("sum=" + sum); //15
		
	}

		}
}