package examLab.exam1.q9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Gened {
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		doNumber(2);
		doNumber(2L);
		doNumber(new int[]{1,2,3,4});
		doNumber(new Integer(2));
		doNumber(new Integer[2]);
		List list = Collections.synchronizedList( new LinkedList());
		Vector v = new Vector();
		v.add(2);
		v.add("w");
		
	}
	public static void doNumber(int dn){
		System.out.println("a");
	}
	public static void doNumber(int... dn){
		System.out.println("b");
	}
	public static void doNumber(Integer dn){
		System.out.println("c");
	}
	public static void doNumber(Integer... dn){
		System.out.println("d");
	}
	public static void doNumber(Object dn){
		System.out.println("e");
	}
}
