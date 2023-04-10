package ex01;

public class Exam08 {

	public static void main(String[] args) {

	int sum = 0;
	int sign = 1;
	int tmp = 0;
	
	for(int i = 1; true ; i ++, sign=-sign) {
	    tmp = sign * i;
	
	    sum += tmp;
		if(sum>=100) break;
	}
	System.out.println(" i :" + tmp + ", sum : " + sum);
}

}