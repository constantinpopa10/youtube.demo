package examLab.exam2.q58B;

import examLab.exam2.q58A.clasA;

public class clasB extends clasA{

	public static void main(String[] args) {
		clasA ca = new clasB();
		clasB cb = new clasB();
		clasB cab = (clasB)ca;
		cab.doThis();

		
	}
	
	public void test(){
		doThis();
	}
}

class test extends clasA{
	public static void main(String[] args) {
		clasB cb = new clasB();
		cb.doThis();
	}
}
