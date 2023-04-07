package ex01;

import java.util.Scanner;

// 세정수를 입력받아서 최대값, 최소값 구하기

public class Exam08 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int a , b, c = sc. nextInt();
			
			String max = "최대값:";
			String min = "최소값:";
			
						
			if(a>b && a>c) {
				System.out.println(max+ a + "입니다.");
			}
			if(b>a && b>c) {
				System.out.println(max+ a + "입니다.");
				
			if(c>a && c>b) {
				System.out.println(max+ a + "입니다.");
				
			if(a>b && a>c) {
				System.out.println(min+ a + "입니다.");
					
			if(b>a && b>c) {
				System.out.println(min+ a + "입니다.");
						
			if(c>a && c>b) {
				System.out.println(min+ a + "입니다.");
			}
			
			System.out.println(" 최대값: " + max);
			System.out.println(" 최소값: " + min);
			
		    
			
			System.out.println("프로그램 종료");
		}
}
			

	


