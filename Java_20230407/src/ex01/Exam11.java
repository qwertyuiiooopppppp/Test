package ex01;

import java.util.Scanner;

// 정수 한개를 입력받아서 그수가 3의 배수인지 판단해라 
public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 정수 입력>");
		int number=sc. nextInt();
		
		if(number % 3 ==0){
		 System.out.println("3의 배수입니다 ");
		}else {
				System.out.println(" 3의 배수가 아닙니다"); 
	}
	}

}
