package scjp.chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
	public static void main(String[] main) {
		System.out.println("First argument: "+ main[0]);
		Pattern p = Pattern.compile(".*?\\.xx");
		String str = "yyxxxy.xx";
		Matcher m = p.matcher(str);
		while(m.find())
		{
			System.out.println("Found at index: " +m.start() + " with value: " + m.group());
		}
	}
}
