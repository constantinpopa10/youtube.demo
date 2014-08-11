package scjp.chapter9.notifyall;

public class Reader extends Thread{
    Calculator c;
    public Reader(Calculator c, String name){
    	super(name);
    	this.c = c;    	
    }
    
    public Reader() {
		// TODO Auto-generated constructor stub
	}

	public void run(){
    	synchronized (c) {
    		try {
				System.out.println("Thread: " + Thread.currentThread().getName() + " Waiting for calculation...");
				c.wait();
			} catch (InterruptedException e) {}
    		System.out.println("Thread: " + Thread.currentThread().getName() + " Total is: " + c.total);
		}
    }
    
    public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Reader r = new Reader();
		new Reader(calculator, "reader1").start();
		new Reader(calculator, "reader2").start();
		new Reader(calculator, "reader3").start();
		calculator.start();
	}
}
