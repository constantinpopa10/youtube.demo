package dessignPatterns.command.headfirst;


public class D_GarageDoor extends D_ElectricDevice {

	public D_GarageDoor(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	public D_GarageDoor(){super();}

	@Override
	public void lightOn() {
		System.out.println(Messages.getString("D_GarageDoor.0"));		 //$NON-NLS-1$
	}

	@Override
	public void lightOff() {
		System.out.println(Messages.getString("D_GarageDoor.1"));		 //$NON-NLS-1$
	}

	@Override
	public void up() throws UnsupportedMethodException {
		System.out.println(Messages.getString("D_GarageDoor.2"));	 //$NON-NLS-1$
	}

	@Override
	public void down() throws UnsupportedMethodException {
		System.out.println(Messages.getString("D_GarageDoor.3"));	 //$NON-NLS-1$
	}

	@Override
	public void stop() throws UnsupportedMethodException {
		System.out.println(Messages.getString("D_GarageDoor.4"));	 //$NON-NLS-1$
	}

	@Override
	public void off() {
		throw new UnsupportedMethodException(Messages.getString("D_GarageDoor.5")); //$NON-NLS-1$
		
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}	

}
