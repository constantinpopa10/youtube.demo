package examLab.exam3;

interface IT {
	int x = 1;
}

class CT {
	int x = 2;
}

public class MC extends CT implements IT {
	
	public static void main(String[] args) {
		//System.out.println(x++);
		Integer it = new Integer(78);
		//boolean b = it.intValue() instanceof Integer; -- compiler error
	}
}
