package scjp.chapter9.tests.test13;

public class Starter implements Runnable {
	void go(long id){
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId() + " " );
		new Thread( new Starter()).start();
		
		//TestPrivate t = new Starter().new TestPrivate();
		//TestPrivate t2 = new Starter().new TestPrivate();
		
		//t2.testMember = t.testMember;
		byte b = 4;
		b++;
		
	}
	
	public void run(){
		go(Thread.currentThread().getId());
	}	

}
