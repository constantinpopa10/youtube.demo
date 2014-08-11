package dessignPatterns.command.headfirst;

public class C_CeilingFanOnCommand extends C_Command{

	@Override
	public void execute() {
		device.on();
		
	}
	
	public C_CeilingFanOnCommand(D_ElectricDevice device) {
		this.device = device;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
