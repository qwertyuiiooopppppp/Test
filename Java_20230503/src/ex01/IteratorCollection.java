package ex01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
//		for( String str : list )
//			System.out.println(str);
		
		// 반복자 
		                            //배열형식   
		Iterator<String> it  = list.iterator();
		while(it.hasNext()) {   // 다음 데이터 가져올게 있으면 true
			String st = it.next();
			            // 데이터를 가져옴 
			System.out.println(st);
		}
		
		System.out.println("----------");
		
		//Box만 삭제하고 싶어 
		it  = list.iterator();
		while(it.hasNext()) {  
			String st = it.next();	            
			if(st.equals("Box"))
				it.remove();
	}
		System.out.println("----------");
		it  = list.iterator();
		while(it.hasNext()) {  
			
			System.out.println(it.next());
			
	//		String st = it.next();	            
	//		System.out.println(st);
	}
}
}