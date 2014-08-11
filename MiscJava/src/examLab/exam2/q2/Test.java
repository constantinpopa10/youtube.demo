package examLab.exam2.q2;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Test {
	public static void main(String[] args) {
		Date date = new Date();
		Locale locale = new Locale(Locale.FRANCE.toString());
		System.out.println(locale.getDisplayCountry());
		DateFormat df = DateFormat.getDateInstance();
		Calendar c = Calendar.getInstance();
		Number n = new Integer(2);
		try {
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
