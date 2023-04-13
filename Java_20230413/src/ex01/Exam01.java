package ex01;

import java.util.Arrays;

public class Exam01 {
// 배열 10개 생성후 랜덤으로 1~100 사이 값을 넣는다
// 배열 10개 총점과 평균을 구한다
// 배열 10개 최대값, 최소값 구한다
// 배열10개 오름차순 정렬은 한다 
	public static void main(String[] args) {
    final int NUM =10;
	int [] score = new int [NUM]; 
	 int sum =0;
    // 배열 10개 생성후 랜덤으로 1~100 사이 값을 넣는다
    for( int i =0; i<score.length; i++) {    
	    score [i]= (int)(Math.random()*100+1);
	    sum+=score[i]; 
    }
	    	System.out.println( "총점" + sum);
	    	System.out.println("평균" + sum/ (double)score.length);
	    	 
	// 배열 10개 최대값, 최소값 구한다 
	 int max =0, min =score[0];
	 
     
     for(int i =0; i<score.length; i++ ) {
    	 if (score[i] > max) {
    		 max=score[i];
     }
	    if(score[i]<min) {    	
    	    min=score[i];
	    } 
	          System.out.println(" 최대값 = "+ max);
	          System.out.println(" 최소값 = "+ max);
	    		
	    		
	       // 배열10개 오름차순 정렬은 한다  		
	    		
	     for(int i=0; i<score.length; i++) {
	    	for( int j= i+1; j<score.length-1; j++) {
	        if(score[i]< score[j]) {
	    	  int tmp= score[i];
	    	  score[i]= score[j];
	    	  score[j]= tmp;
	        }
	}
	    	System.out.println(score[i] + " ,");
	
}