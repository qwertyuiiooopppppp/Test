package ex01;//키보드로 국어, 영어, 수학 점수를 입력받아서 총점, 평균을 출력하라


import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		int kor, eng, math, total; // 정수여서 하나로 묶음 
		// int kor;
		// int math 
		double average; // 실수값
			
		System.out.println("국어 점수>>");
		kor = sc.nextInt();
		System.out.println("영어 점수>>");
		eng = sc.nextInt();
		System.out.println("수학 점수>>");
		
		math = sc.nextInt();
		String str= sc.nextLine();
	
		total= kor+eng+math;
		average= total/3.0;
				
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + average);
		System.out.printf("평균:%.2f\n", average);
  }

}


	


