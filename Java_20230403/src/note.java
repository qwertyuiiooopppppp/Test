
public class note {

	public static void main(String[] args) {

		// 정수 + 정수 => 정수
		// 정수 + 실수 => 실수
	
		// 문자열 + 정수 => 문자열
		// 문자열 + 실수 => 문자열
		
		int num = 10;
		double d = 10.5;
		String s = "eng";
		
		double dd = num + d;
		
		System.out.println(num+d);
		System.out.println(s+d); // "eng" + "10.5" = eng10.5
		System.out.println(s+d+num); // "eng" + "10.5" + "10" = eng10.510
		System.out.println(s+(d+num)); // "eng" + (10.5 + 10) = eng20.5		
		
	}

}
