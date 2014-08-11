package examLab.Diagnostic.q31;

class Super{
	public abstract class High{
		public abstract void printQueue();
	}
	
	public class Low extends High{

		public void printQueue(){
			System.out.println("A");
		}
	}
	
	public class TLow extends Low{
		public void printQueue(){
			System.out.println("B");
		}
	}
}

public class InnerDemo {
	public static void main(String[] args) {
		Super sp = new Super();
		Super.High gh1 = sp.new Low();
		Super.High gh2 = sp.new TLow();
		Super.Low gh3 = sp.new Low();
		Super.Low gh4 = sp.new TLow();
		gh1.printQueue();
		gh2.printQueue();
		gh3.printQueue();
		gh4.printQueue();
		
	}
}
