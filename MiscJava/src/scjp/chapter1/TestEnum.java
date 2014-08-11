package scjp.chapter1;

enum Animals {
	  DOG("woof"), CAT("meow"), FISH("burble");
	  String sound;
	    Animals(String s) { sound = s; }
	 }
	  class TestEnum {
	    static Animals a = Animals.CAT;
	    public static void main(String [] args) {
	    System.out.println(a.sound);
	  }
	 }