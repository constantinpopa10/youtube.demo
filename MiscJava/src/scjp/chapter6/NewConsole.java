package scjp.chapter6;



import java.io.Console;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NewConsole {
	public static void main(String[] args) throws IOException {
		Console c = System.console();
		char[] pw;
		pw = c.readPassword("%s", "pw: ");
		for (char ch : pw)
			c.format("%c", ch);
		c.format("/n");
		MyUtility mu = new MyUtility();
		while (true) {
			String name = c.readLine("%s", "input?: ");
			c.format("output: %s \n", mu.doStuff(name));
			if (name.equals("stop")) {
				break;
			}
		}
		
	}
}

class MyUtility {
	String doStuff(String arg1) {
		return "result is " + arg1;
	}
}
