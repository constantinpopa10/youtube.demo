package examLab.exam1.q11;


public class Greek {
	Integer i = 1;

	public Integer getI() {
		System.out.print("Super");
		return i;
	}

	public static void main(String[] args) {
		Greek ga = new Greek().new Arabik();
		System.out.print(";2-".concat(ga.getI().toString()));
		// System.out.print(ga.getI());
		
	}

	class Arabik extends Greek {
		Integer i = 2;

		public Integer getI() {
			System.out.print("Sub");
			return i;
		}

		public Integer getJ() {
			return 2;
		}
	}
}
