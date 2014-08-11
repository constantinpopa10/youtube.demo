package scjp.chapter9;

public class CountingThread extends Thread {
	public static void main(String[] args) {
		CountingThread ct = new CountingThread();
		ct.start();
	}

	@Override
	public void run() {
		for(int i = 0; i<1000000000 ;i++){
			boolean is10divisor = i%10 == 0;
			System.out.println(i + " ... ");
			if(is10divisor)System.out.println(i + " is multiple of 10");
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {				
//				e.printStackTrace();
//			}
		}
	}
	
	
}
