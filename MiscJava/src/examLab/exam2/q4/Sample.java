package examLab.exam2.q4;

import java.io.Console;
import java.util.Date;

class TSuper{
	  protected TSuper getCls(){
	    return new TSuper();
	  }
	  String getValue(){
	    return "In Super";
	  }
	  public String toString(){
	    return "[Super Class]";
	  }
	}

	class TSub extends TSuper{
	  public TSub getCls(){
	    return new TSub();
	  }
	  public String getValue(){
	    return "In Sub";
	  }
	  public String toString(){
	    return "[Sub Class]";
	  }
	}

	public class Sample{
	  public static void main(String args[]){
	    TSuper ts=new TSub();
	    Object ob=ts.getCls().getValue();
	    System.out.println(ob.toString());
	    Console console = System.console();
	    System.out.println(console.readPassword());
	    Date d1 = new Date();
	    Date d2 = new Date(1000);
	    System.out.println(d1.before(d2));
	    
	    
	  }
	}