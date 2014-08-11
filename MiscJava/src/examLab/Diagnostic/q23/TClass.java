package examLab.Diagnostic.q23;

enum Status{
	TypeA, TypeB
}
public class TClass implements Runnable {
	Status st;
	
	TClass(Status st){
		this.st = st;
	}
	
	public void run(){
		switch(st){
		case TypeA: goA();break;
		case TypeB: goB();break;
		default: assert true; assert true; break;
		}
	}
	
	public void goA(){
		for (int i = 1; i <=4; i++) {
			System.out.println("A: " + i + " ");
		}
	}
	
	public void goB(){
		for (int i = 1; i <=4; i++) {
			System.out.println("B: " + i + " ");
		}
	}
	
    public static void main(String[] args) {
		new TClass(Status.TypeA).start(true);
	}
    public void start(boolean b){
    	new Thread(this).start();
    	new Thread(new TClass(Status.TypeB)).start();
    }
}
