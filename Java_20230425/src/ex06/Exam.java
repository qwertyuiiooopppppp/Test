package ex06;

public class Exam {

	public static void main(String[] args) {
		Car car = new Car ();
		
		car.run1(); //public void run1 () { 호출
		car.run2(); //public void run2 () { 호출
		car.run3(new Tire() {
			public void roll () {
				System.out.println("익명 자식 Tire 객체4이 굴러감");
			}
		});
		
	   car.run3 ( new Tire() {
		   public void roll () {
			   System.out.println("sample2 재정의");
		   }
		
	}

}
