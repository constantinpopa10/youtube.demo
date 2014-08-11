package examLab.Diagnostic.q40;

public class AnotherExam {
	public Boolean b;
	public static void main(String[] args) {
		System.out.println("Value of b without initialization: " + new AnotherExam().b);
		if(new AnotherExam().b)
		{
			System.out.println("A");
			System.out.println(args[0]);
			System.out.println("B");
		}else{
			System.out.println("C");
			new AnotherExam().b=true;
			main(new String[]{"D"});
			System.out.println("E");
		}
	}
}
