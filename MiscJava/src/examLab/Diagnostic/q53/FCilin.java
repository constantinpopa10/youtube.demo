package examLab.Diagnostic.q53;

public class FCilin {
	public static void main(String[] args) {
		try{
			getMe();
		}catch(ArithmeticException ae){
			System.out.println(1);
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(2);
		}catch(NullPointerException ae){
			System.out.println(3);
		}catch(RuntimeException ae){
			System.out.println(4);
		}catch(Exception ae){
			System.out.println(5);
		}
	}
	
	public static void getMe() throws ArithmeticException{
		if(true) throw new NullPointerException();
		throw new ArrayIndexOutOfBoundsException();
	}
}
