package examLab.exam2.q33;

public class TestVarArgsBothPrimitiveAndWrapperJustOneValue {
	public static void main(String[] args) {
		//callMethod(new int[]);	
		
		//String s = new String[]{'x'}[0];
		//String s = new String(null);
		//String s  =new String((String)'x');
		String s = new String(new char[]{0}).toString();
	}
	
	public static void callMethod(Integer... i){
		System.out.println("Wrapper");
	}
	
	public static void callMethod(int...is ){
		System.out.println("Primitive");
	}	
	private abstract class test{}
	static transient String s;
	private static String s2;
}
