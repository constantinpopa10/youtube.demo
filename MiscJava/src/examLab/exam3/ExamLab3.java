package examLab.exam3;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.TreeMap;

public class ExamLab3 extends Thread {
	
	public synchronized void run() {
		doSleep(3000);
	}

	public void doSleep(long x) {
		try {
			Thread.sleep(x);
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}
	}
	enum MEnum{A,B,C};
	public static void main(String[] args) {
		//test8();
		//test9();
		//test12();
		//test13();		
		//test15();		
		//test16();		
		//test17();
		
	}

	private static void test17() {
		Integer i = 1;
		Double d = i.intValue();
		System.out.println(d);
	}

	private static void test16() {
		MEnum me =MEnum.A;
		int A = 99;
		int B = 98;
		int C = 97;
		switch (me) {
		default: System.out.println("Default ");
		case A: System.out.println("Only A ");
		case B: System.out.println("Only B ");	
		case C: System.out.println("Only C ");					
		}
	}

	private static void test15() {
		String[] sa[] = new String[2][];
		sa[0] = new String[]{"A", "B", "C", "D" };
		for (String[] s : sa) {
			System.out.println(s[1] + ", ");
			System.out.println(s[2] + ", ");
		}
	}

	private static void test13() {
		Properties pr = System.getProperties();
		Object s1 = pr.get("exam.name2");
		System.out.println("exam.name="+s1);
	}
	private static void test12() {
		try {
			try {
				throw new InterruptedException("Sun Certified");
			} catch (Exception e) {
				Throwable t = e;
				throw t;
			} finally {
				System.out.println("Finally-A ");
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		} catch (RuntimeException e) {
			System.out.println("RE");
		} catch (Throwable e) {
			System.out.println("T");
		}
	}

	@SuppressWarnings("unchecked")
	private static void test9() {
		Collection<String> st = new LinkedList<String>();
		st.add("five");
		st.add("six");
		st.add("seven");
		st.add("eight");
		System.out.println(Collections.binarySearch((List<String>) st, "ynindde"));
	}

	private static void test8() {
		try {
			ExamLab3 g = new ExamLab3();
			g.start();
			sleep(1000);
			g.interrupt();
			new ExamLab3().doSleep(2000);
			g.start();
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}
	}

}
