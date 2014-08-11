package examLab.exam1.q33;

public class test {
	public static void main(String[] args) {
		rest(new int[]{1,2,3,});
		//rest(4,5);
		
		System.out.printf("%02.2f%s%b", new Double(7), new StringBuffer("set"), "fAlSE");
		System.out.printf("i=%+d", -2);
	}
	public static void rest(int...i){
		System.out.println("a");
	}
	public static void rest(Integer...i){
		System.out.println("b");
	}
}
