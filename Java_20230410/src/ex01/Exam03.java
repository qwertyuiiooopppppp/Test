package ex01;

import java.util.Scanner;

public class Exam03 {
// 사용자로부터 두개의 정수 (시작, 끝)를 입력받아 시작(포함) 해서 끝(포함) 까지의 합을 출력 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc. nextInt();
		int finsh = sc. nextInt();
		int sum = 0;
		
		for(int i =start; i<= finsh; i++)
		sum += i;
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
	}

}
