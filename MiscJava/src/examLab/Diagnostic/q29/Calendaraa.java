package examLab.Diagnostic.q29;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class Calendaraa {
	public static void main(String[] args) {
//		new Calendar(); -- compilation error
		Calendar.getInstance();
//		new Locale(); -- compilation error
//		Locale.getInstance(); -- compilation error
//		new DateFormat(); -- compilation error
		DateFormat.getInstance();
//		new NumberFormat(); -- compilation error
		NumberFormat.getInstance();
	}
}
