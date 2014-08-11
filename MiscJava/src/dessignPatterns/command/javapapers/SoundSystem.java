package dessignPatterns.command.javapapers;

public class SoundSystem implements ConsumerElectronics{
	public void on(){
		System.out.println("Sound system is on!");
	}
	@Override
	public void mute(){
		System.out.println("Sound system in muted!");
	}

}
