package examLab.exam3.q29;

public class Letter<E extends B>{
	public <T extends E> Letter<? super T> getApplication(Letter<? super T> t){
		return t;		
	}
	
	public static void main(String[] args){
		new Letter<B>().getApplication(new Letter<C>());
		new Letter().getApplication(new Letter());
		new Letter().getApplication(new Letter<C>());
	}
}

class A {} class B extends A{} class C extends B{}