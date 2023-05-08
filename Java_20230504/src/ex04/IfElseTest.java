package ex04;

import java.lang.StackWalker.Option;
import java.util.Optional;

class ContInfo{
	String phone;
	String address;
	
	public ContInfo(String phone, String address) {
		
		this.phone = phone;
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}


	
	}
	
public class IfElseTest {

	public static void main(String[] args) {
		
		Optional<ContInfo> c1 = Optional.of(new ContInfo("010", null));
		
		String phone = c1.map(c-> c.getPhone()). orElse("No phone");
		String address =c1.map(c-> c.getAddress()). orElse("No Address");
		System.out.println(phone);
		System.out.println(address);
		
	/*	ContInfo c1 = new ContInfo("010", null);
		
		String phone;
		String address;
		
		if(c1.getPhone() != null)
			phone = c1.getPhone();
		else
			phone = "No phone !!";
			
		if(c1.getAddress()!= null)
			address = c1.getAddress();
		else 
			address = "No Dept";
		
		System.out.println(phone);
		System.out.println(address); */
		

	}

}
