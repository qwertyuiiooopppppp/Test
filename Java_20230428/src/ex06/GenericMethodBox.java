package ex06;

class Box<T> { 
	private T ob;
	
	public T getOb() {
		return ob;
	}
	
	
	public void setOb(T ob) {       
		this.ob= ob;
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
	
		Box<Integer>box1 = new Box<>();
		box1.setOb(99);
		Box<Integer>box2 = new Box<>();
		box2.setOb(55);
		
		//99&55
		System.out.println(box1.getOb() +"&"+ box2.getOb());
		swapBox(box1,box2);
		
		//55&99
		System.out.println(box1.getOb() +"&"+ box2.getOb());
		swapBox(box1,box2);
		
	
	}
	static<T> void swapBox(Box<T> box1, Box<T> box2) {
		Box <T> tmp = new Box<T> ();
		
		tmp.setOb(box1.getOb());
		box1.setOb(box2.getOb());
		box2.setOb(tmp.getOb());
}
}
