package dessignPatterns.command.headfirst;

public class C_LightOnCommand extends C_Command
{
	public C_LightOnCommand(D_ElectricDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.on();		
	}

	@Override
	public void undo() {
		device.off();
		
	}
	

}
