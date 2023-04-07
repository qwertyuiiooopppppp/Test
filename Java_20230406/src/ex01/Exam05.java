package ex01;

import java.util.Scanner; 

// 성적 입력 받아서 70이상 합격
public class Exam05 {

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       
       int jumsu= sc. nextInt(); //성적 입력 받음 
       
       //조건문 ~if~else
       if(jumsu>=70)// 문장 미완성 ; 붙이면 안됨
    	   System.out.println("당신은 합격했습니다.");
       
              
       else
    	   System.out.println("당신은 불합격 입니다.");
       
       System.out.println("프로그램 종료");
       
       
	}
	  
}
