package dessignPatterns.command.headfirst;

public class C_CeilingFanHighCommand extends C_Command {
	int prevSpeed;
	D_CeilingFan ceilingFan;

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();

	}

	@Override
	public void undo() {
		if (prevSpeed == D_CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == D_CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == D_CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == D_CeilingFan.OFF) {
			ceilingFan.off();
		}

	}

	public C_CeilingFanHighCommand(D_ElectricDevice device) {
		this.device = device;
		this.ceilingFan = (D_CeilingFan) device;
	}

}
