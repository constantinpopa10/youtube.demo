package apache.commons;

import org.apache.commons.collections4.Closure;

public class PrintIt implements Closure<Object> {
	// This class implements a Singleton Pattern
	private static PrintIt ourInstance = new PrintIt();

	/**
	 * Get a singleton instance of PrintIt
	 */
	public static PrintIt getInstance() {
		return ourInstance;
	}

	private PrintIt() // This is a singleton, dont change this!
	
	{
		//test change for GITHUB 2
	}

	public void execute(Object o) {
		System.out.println(o.toString());
	}
}