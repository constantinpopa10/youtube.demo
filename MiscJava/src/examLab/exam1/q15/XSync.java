package examLab.exam1.q15;

public class XSync implements Runnable{
	public void run(){
		synchronized ("x") {
			System.out.println("X ");
			this.run2();
		}
	}
	
	public void run2(){
		synchronized ("x") {
			System.out.println("X2 ");
		}
	}
}
