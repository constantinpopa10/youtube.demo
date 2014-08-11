package dessignPatterns.command.headfirst;

public class RemoteControlTest {

	public static void main(String[] args)
	{
		D_ElectricDevice light = new D_Light();
		D_ElectricDevice garage = new D_GarageDoor();
		C_Command lightOnCommand = new C_LightOnCommand(light);
		C_Command garageUpCommand = new C_GarageUpCommand(garage);		
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		
		remoteControl.setCommand(lightOnCommand);
		remoteControl.pressButton();

//		C_Command lightStopCommand = new C_LightStopCommand(light);		
//		remoteControl.setCommand(lightStopCommand);
//		remoteControl.pressButton();
		
		remoteControl.setCommand(garageUpCommand);
		remoteControl.pressButton();
		
		
	}
}
