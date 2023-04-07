package ex01;

public class Exam03 {

	public static void main(String[] args) {

		//int num = 1;
		//int sum = 0;
		//num++; //뒤에 다 같음  num = num+1; / ++num; / num += +1; /
		
		int num = 10;
		int sum = 0;
		int tmp = 0;
		
		tmp = ++num; // tmp = --num; ==> tmp = 9
		sum = num++; // sum = num--; ==> sum = 9 / num = 8
		
		System.out.println("tmp : " + tmp);
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
	}

}
