package examLab.Diagnostic.q22;

public class DivideByZero {
	public static void main(String[] args) {
		int i = 4;
		try{
			i=i/0;			
//		}catch(InterruptedException ex){
//			System.out.println("ie"); -- compilation error
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("aioob");
		}catch(RuntimeException ex){
			System.out.println("re");
		}catch(Exception ex){
			System.out.println("ex");
		}
		
	}
}
