package ex01;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		
		int [] arrNum = { 10,20,30,40,50};
		
		System.out.println(Arrays.toString(arrNum));
		
		int [] arrNum2=  new int [10];
		
		for(int i=0; i<arrNum.length; i++) //arrNum 내용을 arrNum2로 복사
			arrNum2 [i] = arrNum[i];
		
		System.out.println(Arrays.toString(arrNum2));
		
		int[] tmp = new int [10];
		
		int max, min;
		max= min=10;
		
		tmp=arrNum; //arrNum 주소값을 tmp에게 복사 .. 따라서 arrNum과 tmp는 같은 배열 공간을 참조한다.
		
		System.out.println(Arrays.toString(tmp));
		
		arrNum [3] =100;
		System.out.println(Arrays.toString(arrNum));
		System.out.println(Arrays.toString(tmp));
		System.out.println("=============================");
		
		int [] arr = { 10,20,30,40,50};
		int [] arr2 = new int [10];
		
		System.arraycopy( arr, 0, arr2, 0, arr.length);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}

}
