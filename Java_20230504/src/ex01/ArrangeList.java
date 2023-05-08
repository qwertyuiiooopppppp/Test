package ex01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList {

	public static void main(String[] args) {
		
		List<Integer> is = Arrays.asList(1,3,5,7,9);
		
		is= new ArrayList<>(is);
		is.add(11);
		                                   // 클래스이름.메서드
		Consumer<List<Integer>> c = t -> Collections.reverse(t);
	//	Consumer<List<Integer>> c =Collections::reverse; 메서드참조 
                                	
		c.accept(is);
		
		System.out.println(is);
	}

}
