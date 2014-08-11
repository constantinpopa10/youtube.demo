package dessignPatterns.singleton.headfirst;


public class TestSingleton extends Thread{
	public static void main(String[] args) {
		Thread thread1 = new TestSingleton();
		Thread thread2 = new TestSingleton();
		thread1.start();
		thread2.start();
	}

	@Override
	public void run() {
		Singleton singleton = Singleton.getInstace();
	}
	
}
