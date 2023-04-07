package ex01;

public class Exam02 {

	public static void main(String[] args) {

		double d = 85.4;
		int score = 10;
		
		d = score; // d = (double)score;
		
		System.out.println(d);
		
		d = 85.4;
		score = (int)d; // score = d; // 값이 바뀌는것 (소숫점 날림)을 방지하기 위해 큰거에서 작은거로 자동으로 바꿔주지 않음.
		
		System.out.println(score);
		
		int sum = 10;
		long longsum = 3000000000l;
		sum = (int)longsum;
		
		System.out.println(sum);
		
	//	longsum = sum; // longsum = (long)sum 으로 자동으로 바꿔줌.
	//	System.out.println(longsum);
		
		
		
	}

}
