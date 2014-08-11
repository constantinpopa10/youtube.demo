package scjp.chapter9.tests.test15;

public class DudesChat implements Runnable{
	static Dudes d;
	public static void main(String[] args) {
		new DudesChat().go();
	}
	
	void go(){
		d = new Dudes();
		new Thread(new DudesChat()).start();
		new Thread(new DudesChat()).start();
	}
	
	public void run(){
		d.chat(Thread.currentThread().getId());
	}
}

class Dudes {
	static long flag = 0;
	void chat(long id){
		if (flag==0) flag = id;
		for (int i = 1; i < 3; i++) {
			if (flag==id) System.out.println("yo ");
			else System.out.println("dude ");
		} 
	}
}