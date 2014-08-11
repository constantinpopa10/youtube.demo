package dessignPatterns.command.headfirst;

public class D_CeilingFan extends D_ElectricDevice{
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	int speed;

	public D_CeilingFan(String string) {
		super(string);
		speed = OFF;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void high(){
		speed = HIGH;
	    System.out.println("Fan was set HIGH!!!");
	}
	
	public void medium(){
		System.out.println("Fan was set MEDIUM!!!");
	}
	
	public void low(){
		speed = LOW;
		System.out.println("Fan was set LOW!!!");
	}
	

	@Override
	public void lightOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lightOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void up() throws UnsupportedMethodException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void down() throws UnsupportedMethodException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() throws UnsupportedMethodException {
		
		
	}

	@Override
	public void off() {
		speed = OFF;
		System.out.println(type + " fan was turned off!!!");
		
	}
	
	public void on(){
		System.out.println(type + " fan was turned on!!!");
	}

}
