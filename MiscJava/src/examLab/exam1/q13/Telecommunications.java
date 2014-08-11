package examLab.exam1.q13;

public class Telecommunications {
	public static void main(String[] args) {
		Object ob = Services.Hutch == Services.valueOf("Hutch");
		System.out.println(ob);
	}
}

enum Services {
	Hutch(78), Dialog(77), Mobitel(71), Etisalat(72);
	int id = 00;

	Services(int n) {
		id = n;
	}
}