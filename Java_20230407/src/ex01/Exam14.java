package ex01;

import java.util.Scanner;

// 사용자로부터 정수를 입력 받아 양수인지 음수인지 확인하는 프로그램 작성
public class Exam14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println(" 정수 입력");
        int number= sc. nextInt();
        
        if(number>0)
        System.out.println("양수");
        
        else if (number<0)
        System.out.println("음수");
        
	}

}
