package examLab.Diagnostic.q49;

public class Fractal {
	public static void main(String[] args) {
		Fractal ft = new SubFractal();
		String s = (String)((Fractal) ft.getOb()).getMsg();
		System.out.println(s);
	}
	
	public Object getOb(){
		return new Fractal();
	}
	
	public String getMsg(){
		return "SuperStar";
	}
	
	
}

class SubFractal extends Fractal{
	public Fractal getOb(){
		return new Fractal();
	}
	
	public String getMsg(){
		return "SubStar";
	}
}
