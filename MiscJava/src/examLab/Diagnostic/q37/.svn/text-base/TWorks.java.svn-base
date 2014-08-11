package examLab.Diagnostic.q37;

public class TWorks extends Thread{
	public void run(){
		synchronized(new String("a")){
			System.out.println("-A-");
			System.out.println("-B-");
			System.out.println("-C-");
		}
	}
	
	public static void main(String[] args) {
		TWorks tw = new TWorks();
		Thread rb1 = new Thread(tw);
		A<Number> a = new A<Number>();
		
	}
}

class A<K extends Number>{
	public <K> A <? extends Number> useMe(A<? super K> k){ return new A();};
}
