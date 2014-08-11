package heinz.newsletter17_SwitchingOnObjectHandles;

public class Circle extends Shape {
	  public Circle(java.awt.Color color) { super(color); }
	  public void draw() {
	    System.out.println("Circle with color " + getColor());
	  }
	}