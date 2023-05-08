package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ToypriceInfo{
	private String model;
	private int price;
	
	public ToypriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
}
public class MyFristStram2 {

	public static void main(String[] args) {
		List<ToypriceInfo> list = new ArrayList<>();
		
		list.add(new ToypriceInfo ( "GUN_LR_45" ,200));
		list.add(new ToypriceInfo ( "GUN_LR_55" ,600));
		list.add(new ToypriceInfo ( "TEDDY_BEAR_S_014" ,350));
		list.add(new ToypriceInfo ( "CAR_TRANSFORM_VER_778" ,550));
		
		
	// 장난감 가격이 500이상 제품 합은 얼마인가?	
	//	Stream<ToypriceInfo> stream = list.stream();
		
		int sum = list.stream ().filter(n->n.getPrice()>=500)
				.mapToInt(n->n.getPrice())  // mapToInt 정수로 변환해서 내려보냄
		        .sum();
	           	System.out.println("sum:" + sum);
		

		
		
	}
}