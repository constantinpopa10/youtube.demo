package heinz.newsletter150_theBlindSpot;

public class InfiniteThreadTest {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			MyThread t = new MyThread();
			t.start();
			//t.shutdown();
		}
	}
}
