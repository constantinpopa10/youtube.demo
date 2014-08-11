package examLab.exam2.q48;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testArray {
	public static void main(String[] args) throws FileNotFoundException {
		//test();
		FileReader fr = new FileReader(new File("data.txt"));
		try {
			char[] c = new char[(int) new File("data.txt").length()];
			System.out.println(fr.read(c));
			System.out.println(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void test() {
		List<String> t = new ArrayList<>();
		t.add("White");
		t.add("Blue");
		String[] s = new String[]{};
		String[] sb = t.toArray(s);
		List<String> obs = Arrays.asList(sb);
		for(int i = 0; i<2; i++){
			System.out.println(sb[i]+=" Array");
		}
		
		for (String string : t) {
			System.out.println(string + "  ");
		}
		
		for (String string : obs) {
			System.out.println(string);
		}
	}
}
