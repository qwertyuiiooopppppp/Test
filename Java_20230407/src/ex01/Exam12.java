package ex01;

import java.util.Scanner;

// 1학년부터 4학년까지 중간고사 시험을 보았다
// 4학년은70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다
// 이를 판단하는 프로그램을 작성해보자
// 점수가 0미만 100초과이면 경고문구 출력
public class Exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" 학년 입력>");
		int grade= sc.nextInt();
		
		System.out.println(" 점수입력>");
		int middle = sc. nextInt();
		
		if(grade==4 && middle>=70){
		System.out.println("4학년 합격");
		}else if(grade<4 && middle>=60) {
			System.out.println(" 그 외 학년 합격");
		}else if(middle<0 || middle>100)
		System.out.println("0미만 100초과이면 경고문구 출력");
		else
			System.out.println("불합격");
		
	}

}
