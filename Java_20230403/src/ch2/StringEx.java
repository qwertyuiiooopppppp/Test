package ch2;

public class StringEx {

	public static void main(String[] args) {

		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " "); // 7 + "공란"
		System.out.println(" " + 7); // "공란" + "7"
		System.out.println(7 + ""); // 7 + "문자열"
		System.out.println("" + 7); // "문자열" + "7"
		System.out.println("" + ""); // "문자열" + "문자열"
		System.out.println(7 + 7 + ""); // 7 + 7 + "문자열"
		System.out.println("" + 7 + 7); // "문자열" + "7" + "7" => 문장에 "문자열"이 있으면 문장 전체는 "문자열"이됨.
		
		String name2 = new String("Java");
		System.out.println(name2);
		
		double d2 = 10.52456;
		System.out.println(d2);
		System.out.printf("%.2f", d2);
		
		System.out.println("----------------");
		int finger = 15;
		System.out.printf("A : %d B: %d C: %d\n", 10,20,30 );
		//                 8   10  16진법
	}

}
