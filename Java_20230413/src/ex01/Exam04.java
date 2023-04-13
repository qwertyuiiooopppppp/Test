package ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exam04 {

	public static void main(String[] args) {
		
		String []str=new String [3];
		str[0] = " kor";
		str[1]= " eng";
		str[2]= " math";
		String []str2 = new String [] { " kor", " eng2", "math2"};
		
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str2));
		
		String msg =" korea";
		char ch = msg.charAt(0);
		msg.length ();
		                      //  start , end-1
		String msg2= msg.substring(0,3); //kor 
		System.out.println(msg2);
		
		//a==b(기본자료형비교) 기본형외 참조형은 a.equals(b)
		msg.equals(msg2);

		 char[] ch2=msg.toCharArray();
		 System.out.println(Arrays.toString(ch2));
	}

}
