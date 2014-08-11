package examLab.Diagnostic.q36;

public class Convert {
	public static void main(String[] args) {
		int i = (byte) 4;
		byte b = (byte)i;
		short s = b;
		char c = (char)s;
		//java.lang.Character c2 = (Byte)(new java.lang.Byte("4")); -- compilation error
		char c3 = new Character('A').charValue();
		//byte b2 = new java.lang.Byte(4); -- compilation error
		java.lang.Float ft = Float.valueOf("45T").floatValue();
		//java.lang.Float ft2 = Float.parseFloat("45T").floatValue("32F"); -- compilation error
	}
}
