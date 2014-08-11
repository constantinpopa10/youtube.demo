package dessignPatterns.command.headfirst;

public class D_Light extends D_ElectricDevice {

	
	
	public D_Light(String type) {
		super(type);
	}
	
	public D_Light(){}

	@Override
	public void lightOn() {
		System.out.println(type + " Turn light on!");

	}

	@Override
	public void lightOff() {
		System.out.println(type + " Turn light off!");
	}


	@Override
	public void up() throws UnsupportedMethodException {
		throw new UnsupportedMethodException("Up method not supported in Light");
		
	}

	@Override
	public void down() throws UnsupportedMethodException {
		throw new UnsupportedMethodException("Down method not supported in Light");
		
	}

	@Override
	public void stop() throws UnsupportedMethodException {
		throw new UnsupportedMethodException("Stop method not supported in Light");
	}

	@Override
	public void off() {
		System.out.println(type + " light was turned off!!!");
		
	}	
	public void on(){
		System.out.println(type + " light was turned on!!!");
	}

}
