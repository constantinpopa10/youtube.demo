package examLab.exam2.q9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;

public class test {
	public static void main(String[] args) {
		//changeOut();		
		//double i = 0.1;
		//String j = "test";
		//Date i = new Date();
		//int i = 1000;
		BigInteger i = new BigInteger("-1000");
		System.out.format("%,(X", i);
		System.out.println("\n" + Integer.toHexString("0.1".hashCode()));
		//System.out.println("\n" + Integer.toHexString(i.hashCode()));
		
		//System.out.println("\u00a7");		
		
	}

	private static void changeOut() {
		try {
			File file = new File("test.txt");
			file.createNewFile();
			System.setOut(new PrintStream(new FileOutputStream(file)));
		} catch (FileNotFoundException e) {
			System.out.println("find can't be found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
