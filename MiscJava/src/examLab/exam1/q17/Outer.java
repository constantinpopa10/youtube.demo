package examLab.exam1.q17;

public class Outer {
	public static void main(String[] args) {
		System.out.println(new Outer().new Inner().getInt());
	}
	public class Inner{
		private int getInt(){
			return 2;
		}
	}
}
