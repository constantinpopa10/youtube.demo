package examLab.Diagnostic.q56;

public class STClass {
	static int i = 0;
	
	public static int getRef(){
		return i++;
	}
	
	public static class Tash{
		static int p=0;
		public static int getRef(){
			return i+p++;
		}
	}
	
	public static void main(String[] args) {
		int a1 = new STClass().getRef();
		int a2 = new STClass().getRef();
		int a3 = new STClass.Tash().getRef();
		
		//int[] it1 = new int[0] {};
		
		int[] it2 = new int[][]{{1}}[0];
		
		System.out.println(it2);
		
		
	}
}

