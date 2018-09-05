package app.practice;

public class DoubleCheckSingletonTest {

	public static void main(String[] args) {
		System.out.println(Singleton.getInsatnce().hashCode());
		System.out.println(Singleton.getInsatnce().hashCode());
		System.out.println(Singleton.getInsatnce().hashCode());
		System.out.println(Singleton.getInsatnce().hashCode());
	}

}

class Singleton {

	private Singleton() {
	}

	private static Singleton instance = null;

	public static Singleton getInsatnce() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

}
