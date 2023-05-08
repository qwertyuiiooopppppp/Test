package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyFristStram {

	public static void main(String[] args) {
		int[] ar = { 1,2,2,3,4,4,5,5,6}; //배열
		
//		배열의 짝수 합을 구한다 단 중복제거
//		int sum =0;
//		for( int a: ar) {
//			if( a%2 ==0)
//			sum +=a;
//		}
//		System.out.println(sum);
		
		
		IntStream stm1 = Arrays.stream(ar); //배열 ar로부터 스트림 생성
		
		                 // 중복제거  //짝수의합만보냄(중간연산) //최종연산
		int total = stm1.distinct().filter(n-> n%2 ==0).sum();
		System.out.println("total :" + total);
		
		//배열에서 중복제거후 홀수 갯수는 몇개인가?
		stm1 = Arrays.stream(ar);  // 스트림 다시 생성
		long count= stm1.distinct(). filter(n->n%2==1).count();
		System.out.println("홀수갯수 : " + count);
      
		
		
		String [] names = {"kim","park","hong","lee","kor","eng","math"};
		
		//1.이름출력
		Stream<String> stm2 =Arrays.stream(names);
		stm2.forEach(str-> System.out.println(str));
		
		System.out.println("---------");
		
		//2. 첫글자가k만 입력 
		stm2 =Arrays.stream(names);
		stm2.filter(name -> name.startsWith("k"))
		.forEach(str-> System.out.println(str));
		
		System.out.println("---------");
		
		//3. 글자수가 4자 이상만 출력
		stm2 =Arrays.stream(names);    // 최종연산
		stm2.filter(n->n.length() >=4).forEach(n-> System.out.println(n));
		
		System.out.println("----------------");
		
		// 1.리스트를 스트림으로 변환후 출력
		List<String> list = Arrays.asList("Toy", "Box", "Robot");
		Stream<String> s = list.stream();
		s.forEach( n -> System.out.println(n));
		
		
		
		//2. 리스트를 스트림으로 변환후 글자 갯수합을 출력
		list = Arrays.asList("Toy", "Box", "Robot");
		s = list.stream(); //해당 list 모든 요소 
		long count2 = s.map(n->n.length()).count();  // toy를  글자수 반환 
		System.out.println("글자수 :" + count2);
		
		System.out.println("----------------");
		
		s = list.stream();	              
		int sum2 = s.mapToInt(n->n.length()).sum();
		System.out.println("글자수합 :" + sum2);
		 
//		boolean t = test (11);
//		System.out.println(t);
		
	}
	
	static int apply (String s) {
		return s.length();
	}
	
	boolean test( int n) {
		return n %2 ==0;
	}
	static void accept (String str) {
		System.out.println(str);
	}
}
