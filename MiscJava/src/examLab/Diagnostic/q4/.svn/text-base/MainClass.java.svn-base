package examLab.Diagnostic.q4;

class MyException extends Exception {
}

abstract interface newIn{
	public Integer f = 2 ;
	abstract public Integer readBook();
}

public class MainClass {
	static void go() throws Exception{
		System.out.println("Currently executing");
		//throw new Exception();
	}
	
	public static void main(String[] args) {
		System.out.println("Beginning");
		try{
			System.out.println("Start");
			go();
			System.out.println("Stop");
		}catch(Throwable e){
			System.out.println("Caught");
		}finally{
			System.out.println("Finally");
		}
		System.out.println("End");
	}
}
		