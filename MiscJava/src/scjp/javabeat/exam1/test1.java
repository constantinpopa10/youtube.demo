package scjp.javabeat.exam1;

public class test1{
    public test1(){
       this((byte) 4);
    }
    public test1(byte var){
       System.out.println(var);
    }
    public static void main(String[] args){
       test1 t6 = new test1();
    }
}