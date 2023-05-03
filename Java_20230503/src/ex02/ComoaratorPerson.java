package ex02;
import java.util.ArrayList;
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

public class ComoaratorPerson {

	public static void main(String[] args) {
		TreeSet<Person> list =new TreeSet<>();
		list.add(new Person("kim", 26));
		list.add(new Person("park", 21));
		list.add(new Person("yoon", 35));
		list.add(new Person("Lee", 32));
		
	
		for(Person p : list)
			System.out.println(p);

	}

}
