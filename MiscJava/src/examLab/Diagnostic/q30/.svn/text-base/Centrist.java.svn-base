package examLab.Diagnostic.q30;

public class Centrist {
	int inc = 0;

	void Centrist(Integer... i) {
		inc += 1;
		System.out.println(" Centrist(Integer... i) a fost apelata ");
	}

	void Centrist(int... i) {
		inc += 2;
		System.out.println(" Centrist(int... i) a fost apelata ");
	}

	void Centrist(Integer i) {
		inc += 3;
		System.out.println(" Centrist(Integer i) a fost apelata ");
	}

	void Centrist(int i) {
		inc += 4;
		System.out.println(" Centrist(int i) a fost apelata ");
	}

	public static void main(String[] args) {
		Centrist ct = new Centrist();
		ct = new Centrist(); 
		//ct.Centrist(Integer.valueOf(4),Integer.valueOf(4));
		System.out.println("Value: " + ct.inc);
	}
}
