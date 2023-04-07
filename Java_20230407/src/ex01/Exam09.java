package ex01;

import java.util.Scanner;

// 학점 구하기는 switch 으로 변경 
public class Exam09 {

	public static void main(String[] args) {
				
		Scanner sc= new Scanner(System.in);
		System.out.println("성적 입력>");
		int number= sc. nextInt();
		
		
		switch(number / 10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8: 
			System.out.println("B학점");
			break;
		case 7:
		    System.out.println("c학점");
		break;
		case 6:
			System.out.println("D학점");
			break;
			default:
		}
		System.out.println("프로그램 종료");
			
		
		}
	}
