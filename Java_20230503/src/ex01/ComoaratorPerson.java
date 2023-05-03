package ex01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "," + age;
	}

	@Override
	public int compareTo(Person p) {
		return this.age - p.age;
	}
}
class PersonComparator implements Comparator<Person>{
public class ComoaratorPerson {
//@Override
//public int compare(Person o1, Person o2) {
//	return o1.age - o2.age;
}

	public static void main(String[] args) {
		List <Person> list =new ArrayList();
		list.add(new Person("kim", 26));
		list.add(new Person("park", 21));
		list.add(new Person("yoon", 35));
		list.add(new Person("Lee", 32));
		
		//Collections.sort(list); 기본자료형만 sort
	
		Collections.sort(list, new PersonComparator());
//		@Override
//		public int compare(Person o1, Person o2) {
//			return o1.age - o2.age;
//	
		for(Person p : list)
			System.out.println(p);

	
	}

	@Override
	public int compare(Person o1, Person o2) {
		return 0;
	}

	}





