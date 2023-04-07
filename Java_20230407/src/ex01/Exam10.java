package ex01;

import java.util.Scanner;


public class Exam10 {
// 정수 한개를 입력받아 그 수가 50이상 수 인지 50미만의 수인지 판단해라
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num>50) 
		System.out.println("50이상");
	
		else(num<50)
		System.out.println("50미만");
	}

}
