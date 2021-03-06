package dessignPatterns.command.headfirst;


public class RemoteLoader {

	public static void main(String[] args){
		RemoteControl remoteControl = new RemoteControl();
		D_Light livingRoomLight = new D_Light("Living Room");
		D_Light kitchenLight = new D_Light("Kitchen");
	    D_CeilingFan ceilingFan = new D_CeilingFan("Living Room");
	    D_GarageDoor garageDoor = new D_GarageDoor("");
	    D_Stereo stereo = new D_Stereo ("Living Room");
	    
	    C_LightOnCommand livingRoomLightOn = new C_LightOnCommand(livingRoomLight);
	    C_LightOffCommand livingRoomLightOff = new C_LightOffCommand(livingRoomLight);
	    C_LightOnCommand kitchenLightOn = new C_LightOnCommand(kitchenLight);
	    C_LightOffCommand kitchenLightOff = new C_LightOffCommand(kitchenLight);
	    
	    C_CeilingFanOnCommand ceilingFanOn = new C_CeilingFanOnCommand(ceilingFan);
	    C_CeilingFanOffCommand ceilingFanOff = new C_CeilingFanOffCommand(ceilingFan);
	    
	    C_GarageUpCommand garageDoorUpCommand = new C_GarageUpCommand(garageDoor);
	    C_GarageDownCommand garageDoorDownCommand = new C_GarageDownCommand(garageDoor);
	    
	    C_StereoOnWithCDCommand stereoOnWithCDCommand = new C_StereoOnWithCDCommand(stereo);
	    C_StereoOffCommand stereoOff = new C_StereoOffCommand(stereo);
	    
	    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
	    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
	    remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
	    remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOff);
	    
	    System.out.println(remoteControl);
	    
	    remoteControl.onButtonWasPushed(0);
	    remoteControl.offButtonWasPushed(0);
	    remoteControl.onButtonWasPushed(1);
	    remoteControl.offButtonWasPushed(1);
	    remoteControl.onButtonWasPushed(2);
	    remoteControl.offButtonWasPushed(2);
	    remoteControl.onButtonWasPushed(3);
	    remoteControl.offButtonWasPushed(3);
	    
	}
	
}

