package misc;

public class SignExtensionBitMask {
	public static void main(String[] args) {
			byte b = -3;
			char c = (char) (b  & 0xff );
			System.out.println("Byte: To binary string: " + Integer.toBinaryString(b));
			System.out.println("Byte: To hex string: " + Integer.toHexString(b));
			
			System.out.println("Char: To binary string: " + Integer.toBinaryString(c));
			System.out.println("Char: To hex string: " + Integer.toHexString(c));
	}
}
