package examLab.exam1.q42;

public class Gabc {
	Gabc ob[];
	public Gabc(Gabc...gb){
		ob=gb;
	}
	
	public static void main(String[] args) {
		Gabc bc = new Gabc(new Gabc(), new Gabc());
		bc.ob[1].ob=new Gabc[]{new Gabc(), bc.ob[0]};
		bc.ob[0] = null;
		bc.ob[1].ob[1] = null;	
		synchronized (Gabc.class) {
			
		}
		System.gc();
	}
	public void finalize(){
		System.out.println("-GCed-");
	}
}
