package ch6;

class car {
	String color;
	String gearType;
	int door;
	
	car(){
		this("White" , " auto", 4);
	}
	car(String color) {
		this (color, "auto" , 4);
	}
	car(String color, String gearType, int door){
		this.color = color;
		this. gearType= gearType;
		this.door= door;
	}
}

 class CarTest2 {

	public static void main(String[] args) {
		car c1 = new car();
		car c2 = new car("blue");
		
		System.out.println(" c1의 color = " + c1.color+ ", gearType="+ c1. gearType+", door ="+c1.door);
		System.out.println(" c2의 color = " + c2.color+ ", gearType="+ c2. gearType+", door ="+c2.door);
	}

}
