package examLab.exam2.q60;

public class Top {
	protected Number goNow(){
		return 4;
	}
	
	public static void main(String[] args) {
		Top tb = new Bot();
		float f = (Float) tb.goNow();
		System.out.print(f);
	}
}

class Bot extends Top{
	protected Integer goNow(){
		return 5;
	}
}
