package dessignPatterns.singleton.headfirst;

public class Singleton {
	private Singleton() {
		System.out.println("Created singleton");
	};

	private volatile static Singleton singleton;

	public static Singleton getInstace() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
