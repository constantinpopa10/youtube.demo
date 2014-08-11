package dessignPatterns.command.headfirst;

public abstract class D_ElectricDevice {
	public abstract void lightOn();
	public abstract void lightOff();
	public abstract void up() throws UnsupportedMethodException;
	public abstract void down() throws UnsupportedMethodException;
	public abstract void stop() throws UnsupportedMethodException;
	public abstract void off();
	public abstract void on();
	public void setCD(){};
	public void setVolume(){};
	
	protected String type;
	
	public D_ElectricDevice(String type){
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public D_ElectricDevice(){}
}
