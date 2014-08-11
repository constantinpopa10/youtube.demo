package dessignPatterns.command.headfirst;

public class C_LightOffCommand extends C_Command {

	@Override
	public void execute() {		
		device.off();
	}
	public C_LightOffCommand(D_ElectricDevice device) {
		this.device = device;
	}
	@Override
	public void undo() {
		device.on();
		
	}

}
