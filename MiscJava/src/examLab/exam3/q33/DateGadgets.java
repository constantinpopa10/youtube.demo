package examLab.exam3.q33;

import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateGadgets {
	public static void main(String[] args) {
		Calendar cd = Calendar.getInstance();
		GregorianCalendar gc= (GregorianCalendar) GregorianCalendar.getInstance();
		boolean file = new File("").equals("");
		int s = ActionEvent.CTRL_MASK;
		Double d = 2d/0d;
		System.out.println(d);
	}
}
