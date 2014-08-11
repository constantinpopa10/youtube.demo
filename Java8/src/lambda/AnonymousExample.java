package lambda;

public class AnonymousExample {
	
	public static void main(String[] args) {
		new AnonymousExample().anonymousExample();
	}

	public void anonymousExample() {
		String nonFinalVariable = "Non Final Example";
		String variable = "Outer Method Variable";
		new Thread(new Runnable() {
			String variable = "Runnable Class Member";

			public void run() {
				String variable = "Run Method Variable";
				// Below line gives compilation error.
				// System.out.println("->" + nonFinalVariable);
				System.out.println("->" + variable);
				System.out.println("->" + this.variable);
			}
		}).start();

	}
}