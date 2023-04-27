package ex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam {

	public static void main(String[] args) {
		
		String str = "111a121111234567890";  // 숫자만 입력해라 
		
       Pattern p = Pattern.compile("^[0-9]*$");  //정규식 // ^시작을 뜻함
		Matcher m = p.matcher(str); // str 이 정규 표현식과 일치하는지 판단
		System.out.println(m.find());  
		
		
		
		System.out.println("----------------------");
		String str2 ="ABC123";  //6자 입력해 단 숫자하고 대문자만 입력해 
		Pattern p2 = Pattern.compile("^[0-9A-Z] {6}$");
	    Matcher m2 = p2.matcher(str2);
		System.out.println(m2.find()); 
		
		System.out.println("----------------------");
	    String str3 ="aa111@11111.com";
	    Pattern p3 = Pattern.compile("[\\w]@[\\w]*.com$");
	    Matcher m3 = p3.matcher(str3);
	    System.out.println(m3.find());
	}

}
