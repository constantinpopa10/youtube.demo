package dessignPatterns.command.headfirst;

public class C_CeilingFanOffCommand extends C_Command{

	@Override
	public void execute() {
		device.off();
		
	}
	
	public C_CeilingFanOffCommand(D_ElectricDevice device) {
		this.device = device;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
