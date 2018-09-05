package app.practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Sorting {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		System.out.println("After by Sort............");

		// lambda here!
		listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());

		// java 8 only, lambda also, to print the List
		listDevs.forEach((developer) -> System.out.println(developer));

		System.out.println("Sort by Name.........");
		// lambda here!
		listDevs.sort((Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName()));

		// java 8 only, lambda also, to print the List
		listDevs.forEach((developer) -> System.out.println(developer));
		
		System.out.println("Sort by Sal reverse .........");
		Comparator<Developer> salaryComparator = (o1, o2)->o1.getSal().compareTo(o2.getSal());
		listDevs.sort(salaryComparator.reversed());
		listDevs.forEach((developer) -> System.out.println(developer));
		
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;

	}

}

class Developer {

	Developer(String name, BigDecimal sal, int age) {
		this.name = name;
		this.sal = sal;
		this.age = age;
	}

	int age;
	String name;
	BigDecimal sal;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSal() {
		return sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Name :" + name + ", sal :" + sal + ", age :" + age;
	}

}
