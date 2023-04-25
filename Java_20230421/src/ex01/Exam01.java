package ex01;

public class Exam01 {
   public static void main(String[] args) {
      
      Buyer b = new Buyer();
      b.buy(new Tv());
      b.buy(new Computer());
      b.buy(new Tv());
      b.buy(new Audio());
      b.buy(new Computer());
      b.buy(new Computer());
      b.buy(new Computer());
      
      b.summary();
   }
}




class Buyer{
   int money =1000;
   Product[] cart = new Product[3]; //구입한 제품을 저장하기 위한 배열
   int i = 0;   
   int sum=0;
   int tmp;
   
	void buy(Product p) { //100
		
		if (money < p.price) {
	         System.out.println("소지한 돈은 "+ money +" 입니다."+(p.price-money)+ "부족합니다.");
	         return;
		}
		money -= p.price;
	      add(p);   // 구입한 물건은 tv, audio,computer, computer
     }
	      

	// 구입한 제품을 저장하기 위한 배열
	 //가진돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드 종료
	 // 가진돈이 충분하면 제품의 가격을 가진 돈에서 빼고
	 // 장바구니에 구입한 물건을 담는다(add메서드호출)
	

	void add(Product p) {
		
		if( i>=cart.length) {
			Product [] tmp = new Product[cart.length*2];
			System.arraycopy(cart,0, tmp,0, cart.length);
		//	for( int j =0; j<cart.length; j++)
		//		tmp[j]= cart[j];
			cart= tmp;
		}
		
       cart [i] =p;    
       i++;
       
    }
    
	// i 값이 장바구니의 크기보다 같거나 크면
	// 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다  
	//  기존의 장바구니의 내용을 새로운 배열에 복사    
	// 새로운 장바구니와 기존의 장바구니를 바꾼다   
	// 물건을 장바구니에 저장한다 그리고 i값을 i 증가시킨다  
	   
       // 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다
	   void summary() {
		   System.out.println("구입한 물건 :");
		   for(int i=0; i<cart.length; i++) {
			   System.out.println(cart[i] + ",");
			   System.out.println();
			   System.out.println(" 사용한 금액 :" + (1000-money));
			   System.out.println(" 남은 금액 :" + money);
		   }
	   }
		      
	//	     for(int j=0; j<i; j++) {
	//	     System.out.println(cart[j]);
	//	     sum += cart[j].price;
      
	//	      System.out.println(sum);
	//	      System.out.println("총 금액은 : " + sum + "입니다.");
	//	      money -= sum;
	//	      System.out.println("남은 금액 : "+ money);
	//	   }   
	//	}

   // 장바구니에 담긴 물건들의 목록을 만들어 출력한다
   // 장바구니에 담긴 물건들의 가격을 모두 더해서 출력
   // 물건을 사고 남은 금액 출력
}
		class Product {
		   int price;
		   
		   Product(int price) {
		      this.price = price;
		   }
		}

		class Tv extends Product {
		   Tv() { super(100); } 
		   
		   public String toString() { return "Tv"; }
		   
		}

		class Computer extends Product {
		   Computer() { super(200); }
		   
		   public String toString() { return "Computer"; }
		   
		}
		class Audio extends Product {
		   Audio() { super(50); }
		   
		   public String toString() { return "Audio"; }
		   
		}

