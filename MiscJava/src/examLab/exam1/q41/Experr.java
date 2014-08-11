package examLab.exam1.q41;


class A{
	public void blast() throws InterruptedException{
		throw new InterruptedException();
	}
	
	
}
class B extends A{
	public void blast() throws NumberFormatException{
		throw new NumberFormatException();
	}
}
public class Experr {
	public static void main(String[] args) throws InterruptedException  {
		A ab = new B();
		ab.blast();
		System.out.println("Done");
	}
}
