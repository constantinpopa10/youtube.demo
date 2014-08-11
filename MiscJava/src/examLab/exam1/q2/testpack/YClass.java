package examLab.exam1.q2.testpack;

import examLab.exam1.q2.XClass;
import examLab.exam1.q2.XInterface;

public class YClass extends XClass implements XInterface {
	{
		s = "C#";
	}

	public void runDemo() {
		System.out.println("Demo" + super.s);
	}

	public static void main(String[] args) {
		XInterface xi = new YClass();
		xi.runDemo();
	}
}
