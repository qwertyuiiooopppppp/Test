package ex01;

public class Exam07 {
// 1+(-2) +3 + (-4) + .....이런식으로 더해나갈때, 몇까지 더해야 총합이 100이상 될까?
// 이 때 i 값하고 총합을 출력 
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		for(;  ; i++) {
			
			if(i % 2 ==1) //홀
			   sum +=i;
			else
				sum -=i;
			
			if(sum>=100) break;
		}
		System.out.println(" i :" + i + ", sum : " + sum);
	}

}
