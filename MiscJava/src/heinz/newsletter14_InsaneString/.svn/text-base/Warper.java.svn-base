package heinz.newsletter14_InsaneString;

import java.lang.reflect.Field;

public class Warper {
private static Field stringValue;
static {
	//String has a private char [] called "value"
	//if it does not, find the char [] and assign it to value
	try {
		stringValue = String.class.getDeclaredField("value");
	} catch(NoSuchFieldException ex) {
		Field [] all = String.class.getDeclaredFields();
		for (int i=0; stringValue == null && i<all.length; i++){
			if (all[i].getType().equals(char[].class)){
				stringValue = all[i];
			}
		}
	}
	if (stringValue != null) {
		stringValue.setAccessible(true);
	}
}
public Warper()  {
	try {
		try {
			stringValue.set(
					"Romeo, Romeo, wherefore art thou oh Romero?",
					"Stop this romance nonsense, or I'll be sick".toCharArray());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stringValue.set("hi there", "cheers !".toCharArray());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch(IllegalArgumentException ex) {
		
	}
}
}
