package ex01;

import java.util.Scanner;

public class Exam15 {
// 첫 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 
	 System.out.println("문자열 입력>>");
     String str = sc. nextLine();

	System.out.println("입력한 문자열: "+ str );
	
	
	char ch = str.charAt(0);
	char ch2 = 'A';
	System.out.println(" 첫번째 문자: " + ch);
	
	if('a'<= ch && ch > 'z')
		System.out.println("첫 글자는 소문자이네.");
	else if('A'<= ch && ch<= 'Z')
		System.out.println("첫 글자는 대문자이네.");
	else
		System.out.println(" 영문자가 아님!!");
	
	}

}
