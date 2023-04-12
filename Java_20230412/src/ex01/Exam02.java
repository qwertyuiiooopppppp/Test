package ex01;

public class Exam02 {

		// 조원 3명 자바점수 입력받아서 
		// 자바점수 배점은 랜덤함수이용해서 50~100값이 저장되도록 한다
		// 조원 총점, 평균을 출력한다 

			public static void main(String[] args) {
				
				
			final int MAX =3;
			double avg =0;
			
			int[] 조4 = new int[Max];
			
			for(int i=0; i<max; i++) {
				조4[i] = (int)(Math.random() *50+1) +50;
			}
			
			for(int i=0; i<max; i++)
				sum += 조4[i];
			avg= sum/3.0;
				
		 for(int i =0; i<max; i++)
			 System.out.println( 조4[i] + " ,");
		 
			     System.out.println();
			     System.out.println(sum + "," + avg );
	}

}
