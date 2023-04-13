package ex01;

public class Exam05 {

	public static void main(String[] args) {
		
		int [] n = new int [5];
		
		int [] [] num= new int [4][3];  //4행3열
		num [2] [1] =100;
		
		int [][] num2 = {
				{1,2,3,3},  //4  num2[0]
				{4,5,6,6,5}, //5  num2[1]
				{7,8,9,8,8,9} //6  num2[2]
					
		};
		for(int i =0; i<3; i++) {
			for(int j=0; j<num2[i].length; j++)
				System.out.print(num2[i][j]+ " ,");
		System.out.println();
		
		
		
		
		
	}
	}

}
