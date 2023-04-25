package ex08;

public class CalExam01 {

	public static void main(String[] args) {
		Calculable cal = new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println(" x+y : " + (x+y));
			}
			};
			cal.calculate(5, 2);
			
			cal = new Calculable () {

				
				//람다식 ( 인터페이스가 존재햐야함, 추상메서드 하나만)
				public void calculate(int x, int y) {
					System.out.println(" x+y : " + (x-y));
				}
				};
				cal.calculate(5, 7);
				
				cal=( int x, int y)->{
					System.out.println(" x-y : " + (x-y));
				};
				cal.calculate(15,7);
				
				cal=( x, y)-> System.out.println(" x-y : " + (x-y));
			    cal.calculate(17,7);
			    
			    cal=( x, y)-> System.out.println(" x x y : " + (x*y));
			    cal.calculate(5,5);
				
				
				
	}
	

	}


