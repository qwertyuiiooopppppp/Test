package ex01;


public class Exam01 {


// 조원 3명 자바점수 입력받아서 
// 자바점수 배점은 랜덤함수이용해서 50~100값이 저장되도록 한다
// 조원 총점, 평균을 출력한다 

	public static void main(String[] args) {
		System.out.println(" 자바 점수 입력해주세요");
		int 조원1,조원2,조원3 , sum;
	
		double avg =0;
		//50~100
		조원1 = (int)(Math.random()*50+1) +50;
		조원2 = (int)(Math.random()*50+1) +50;
		조원3 = (int)(Math.random()*50+1) +50;
		
         sum = 조원1 + 조원2 + 조원3;
	     avg= sum/3.0;
	     
	     System.out.println( 조원1 +","+ 조원2 + "," + 조원3);
	     System.out.println(sum + "," + avg );
	}
	
		
	
		
		}
		
		
	


