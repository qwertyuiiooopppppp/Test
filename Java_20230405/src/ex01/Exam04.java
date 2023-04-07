package ex01;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// int num = 8;
		// int cnt = 3;
		
		//System.out.println(num / cnt); // ==> 몫
		//System.out.println(num % cnt); // ==> 나머지
		
		//Q. 키보드로 4000을 입력받는데 4000초
		//Q. 화면상 출력 1시간 6분 40초

		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력해 주세요.>");
		
		int num = sc.nextInt();
		
		int hr = num / 3600;		
		int min = ( num / 60 ) - (hr*60);	
		int sec = num % ( num / 60 );
		
		System.out.print(hr + " hr ");
		System.out.print(min + " min ");
		System.out.print(sec + " sec ");
		
		
		//키보드로 국어, 영어, 수학 점수를 입력받아서 총점, 평균을 출력하라
		

		Scanner Sc = new Scanner (System.in);
		
		int kor, eng, math, total;
		double average;
		
		kor= sc.nextInt();
		eng= sc.nextInt();
		math=sc.nextInt();
		
		total= kor+eng+math;
		average= total/3.0;
		
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + average);
		
		
	}

}
