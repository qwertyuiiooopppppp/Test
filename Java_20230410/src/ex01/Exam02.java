package ex01;

public class Exam02 {
// 1~100 홀수 갯수?
	public static void main(String[] args) {
		int count= 0;
		for(int i = 1; i<=100; i++) {
			if( i % 2 == 1) {
				System.out.print( i + " , ");
			count++;
		}		
		

	}
		 System.out.println("1번째 => 1~100 에서 홀수 갯수는 :" + count);
	
		 for(int i = 1; i<=100; i =i+2)  // i += 2
				count++;
	     System.out.println(" 2번째 => 1~100 사이 홀수는:" + count);
	
     
    	 }
     
}
