package ex01;

public class Exam01 {
// 1~10 합 누적
	public static void main(String[] args) {
		
/*		int total=0;
		int num = 10;
		
		for(int i=1; i<=10; i++)
			total += i;
		
		System.out.println(" 1~" +num+ "까지 합 : " + total);
*/		
		// 1과 100사이의 2와 3의 배수 (i가 101이 될때까지 무한반복)
		
		int count= 0;
		for(int i = 1; i<=100; i++) {
			if( i % 2 ==0 && i % 3 ==0) {
				System.out.print( i + " , ");
			count++;
		}		
		

	}
		 System.out.println(" \n1~100 에서 2와 3의 배수 갯수는 :" + count);

}
}