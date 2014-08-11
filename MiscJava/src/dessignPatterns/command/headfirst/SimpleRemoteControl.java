package dessignPatterns.command.headfirst;

public class SimpleRemoteControl {
	private C_Command command;

	public SimpleRemoteControl(C_Command commadn) {
		this.command = commadn;
	}
	
	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}

	public void pressButton()
	{
		command.execute();
	}

	public C_Command getCommand() {
		return command;
	}

	public void setCommand(C_Command command) {
		this.command = command;
	}
	
	

}
