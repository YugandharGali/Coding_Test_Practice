package app.practice;

public class SingletonEnumTest {

	public static void main(String[] args) {
		SingletonEnum singleton = SingletonEnum.INSTANCE;
		
		System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
		
		System.out.println("1: hash"+singleton.hashCode());
		
		SingletonEnum singleton1 = SingletonEnum.INSTANCE;
		System.out.println("1: hash"+singleton1.hashCode());
	}
}
