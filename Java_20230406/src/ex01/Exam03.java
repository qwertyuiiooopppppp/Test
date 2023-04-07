package ex01;

import java.util.Scanner;

// 나의 이름, 주소, 나이(만으로입력) 받아서 출력하는 프로그램 작성( 단 나이는 +1해서 출력)

public class Exam03 {

	public static void main(String[] args) {
		
		
		Scanner sn = new Scanner(System.in);
		
		// nextline, nextInt
		
		int age = sn.nextInt(); // 입력 버퍼 남아있는 엔터를 제거하라
		// 이유는 엔터를 제거하지않으면 string name= sn.nextline()이 문장에서 엔터를
		// 문장으로 인식해서 버퍼 남은 엔터를 name 변수에 넣는다.
		String name = sn. nextLine();
		String address= sn.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이: " +(age +1));
		 
	}

}
