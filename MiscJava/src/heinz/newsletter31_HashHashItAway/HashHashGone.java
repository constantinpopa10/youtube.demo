package heinz.newsletter31_HashHashItAway;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashHashGone {
	private static final Field intValue;
	static{
		try {
			intValue = Integer.class.getDeclaredField("value");
			intValue.setAccessible(true);
		} catch (NoSuchFieldException e) {
			throw new RuntimeException("Seriour error - no \"value\" field found in Integer");
		}		
	}
	
	private static void setInteger(Integer i, int newInt){
		try {
			intValue.set(i, new Integer(newInt));			
		} catch (IllegalAccessException e) {
			throw new RuntimeException("Serious error - field should have been accessible");
		}
	}
	
	private static void printDetailed(Set set){
		System.out.println("[");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println("\t(toString()=" + val + ",class="
					+ val.getClass().getName() + ",identityHashCode="
					+ System.identityHashCode(val) + ")");
			if(it.hasNext())System.out.println(", ");
			System.out.println();
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		if(args.length !=2){
			System.out.println("arguments: <initial-intvalue> <num-copies-to-insert-in-Set>");
			return;
		}
		int initialValue = Integer.parseInt(args[0]);
		int numberOfCopiesToInsert = Integer.parseInt(args[1]);
		
		Integer x = new Integer(initialValue);
		System.out.println("Original x hashcode: " + System.identityHashCode(x));
		int currValue = initialValue;
		
		Set set = new HashSet();
		for (int i = 0; i < numberOfCopiesToInsert; i++) {
			setInteger(x, ++currValue);
			set.add(x);
		}
		
		setInteger(x, initialValue);
		
		System.out.println("here's a set containing " + numberOfCopiesToInsert + " copies of Integer(" + x + "): " );
		
		System.out.println(set);
		
		System.out.println("detailed view of set: ");
		printDetailed(set);
		
		System.out.println("and does it contain that Integer?: " + set.contains(x));
		
		System.out.println("can the Integer be removed from the set?");
		System.out.println(set.remove(x));
		
		System.out.println("the Set contents after attempted remove:");
		System.out.println(set);
		
		setInteger(x, -initialValue);
		System.out.println("altering the Integer to its opposite makes the Set contain:");
		System.out.println(set);
		
		setInteger(x, initialValue);
		currValue = initialValue;
		for (int i = 0; i < numberOfCopiesToInsert; i++) {
			setInteger(x, ++currValue);
			set.remove(x);
		}
		
		System.out.println("now all the elements have been removed from the Set as it contains: ");
		System.out.println(set);
		System.out.println();
	}
	
	
}
