package ex01;

import java.util.Scanner;

// 성적을 입력받아서 학점을 구하는 프로그램 작성
// 90이상 A, 80이상 B, 70이상 C, 60이상 D ,나머지 F

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in );
		System.out.println("성적 입력>");
	    int number = sc.nextInt();
	    
	    if(number>90) {
	    System.out.println("A 학점");
	    else {
	    
	    if(number>80)
	    	
	    		System.out.println("B 학점");
	    else {
	    	  if(number>70)
	    		System.out.println("C 학점");
	    else{
	    	  if(number>60)
	    		System.out.println("D 학점");
	    else {
	    		System.out.println("F 학점");
	    	
	    }
	    }
	    }
	    }
	    }
	}
}
}
}
}

