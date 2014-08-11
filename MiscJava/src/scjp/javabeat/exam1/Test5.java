package scjp.javabeat.exam1;

class Sup1{
    public Sup1(){
         System.out.println("Hai");
    }
    private Sup1(String str){
        System.out.println(str);
    }
}

public class Test5 extends Sup1{
    private Test5(String str){
    	super();
        System.out.println(str);         
    }
    public static void main(String[] args) {
        Test5 t5 = new Test5("HI");
    }
}
