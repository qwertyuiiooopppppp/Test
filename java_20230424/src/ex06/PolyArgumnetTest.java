package ex06;

class product {
	int price;    // 제품의가격
	int bonuspoint; // 제품 구매시제고오하는 보너스 점수
	
	product (int price) {
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
	product() {}
}
class Tv extends product{
	Tv () {super(100); }
	public String toString() { return "Tv"; }
}
class Computer extends product{
 Computer () {super(200); }
 public String toString() { return "Computer"; }
}
class Audio extends product{
	Audio () {super(50); }
	 public String toString() { return "Audio"; }
}
class Buyer {              //고객, 물건을 사는 사람
	int money =1000;       // 소유금액
	int bonuspoint =0;    // 보너스점수
	product [] item = new product [10]; // 구입제품을 저장하기 위한 배열
	int i =0; //product배열에 사용될 카운터
	
	void buy (product p) {
		if( money <p.price) {
			System.out.println(" 잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;   // 가진 돈에서 구인한 제품의 가격을 뺀다
		bonuspoint += p.bonuspoint;// 제품의 보너스 점수를 추가한다
		item [ i++] =p; // 제품을 product [] item 저장한다
		System.out.println("p + 을 구입하였습니다.");
	}
	void summary () { // 구매한 물품이 대한 정보를 요약해서 보여준다
		int sum =0; // 구입한 물품의 가격합계
		String itemList = ""; // 구입한 물품목록
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다
		for( int i =0; i<item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ",";
		}
		System.out.println("구입하신 물품의 총금액은" +sum + " 만원입니다.");
		System.out.println(" 구입하신 제품" + itemList+ "입니다.");
	}
}
     class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy (new Tv());
		b.buy (new Computer());
		b.buy (new Audio());
		b. summary();

	}

}
