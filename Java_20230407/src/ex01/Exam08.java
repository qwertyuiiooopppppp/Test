package ex01;

import java.util.Scanner;

// 컴퓨터랑 가위바위보 게임..
public class Exam08 {

	public static void main(String[] args) {
		
		
		int random =(int) (Math.random()*3)+1; // 0~9 정수 ==> 1~10
		
		System.out.println(random);

		System.out.println("1(가위),2(바위),3(보) 중 입력하세요>");
		Scanner sc= new Scanner(System.in);
		int user= sc. nextInt();
		
		switch(user-com) {
		case 0 :
			System.out.println("비김");
		    break;
		case-2:
		case 1:
		    System.out.println("User 승!");
		    break;
		case -1:
		case 2:
		System.out.println("User 승!");
	}
		System.out.println("User : " user + ", Com: " + com);
	}
}
