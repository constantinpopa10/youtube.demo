package dessignPatterns.command.headfirst;

public class C_MacroCommand extends C_Command {
	C_Command[] commands;

	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	
	public C_MacroCommand(C_Command[] commands){
		this.commands = commands;
	}

}
