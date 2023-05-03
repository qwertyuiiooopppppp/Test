package ex03;

import java.util.HashSet;
import java.util.Set;

class Num{
	private int  num;
	public Num (int num) {
		this.num = num;
		
	}@Override
	public String toString() {
		return String.valueOf(num); // "10" num +""
	}
	
	@Override
	public int hashCode() {
		return num%3;
	}
	@Override
	public boolean equals(Object obj) {
//		if(num==((Num)obj).num)
//			return true;
//		else return false;
		
		return num==((Num)obj).num ? true : false;
	}
		
	}

public class HashSetcollection {

	public static void main(String[] args) {
		                                 // 내가만든클래스는 중복됨 재정의해야함 해시코드, equals
		Set<Num> set = new HashSet();    //순서 x 중복 x
		
		set.add(new Num (10));
		set.add(new Num (20));
		set.add(new Num (10));
		set.add(new Num (20));
		set.add(new Num (20));
		set.add(new Num (20));
		
		
	     
		for(Num s: set)
			System.out.println(s);
		
		Set<Integer> set2 = new HashSet();
		for(int i=0; set2.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}
		for(int s: set2)
			System.out.println(s+ ",");
		
	}

}
