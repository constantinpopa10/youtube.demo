package dessignPatterns.command.javapapers;

import java.util.ArrayList;
import java.util.List;

public class DemoCommandPattern {
	
	public static void main  (String[] args) {
		
		ConsumerElectronics ce = UniversalRemote.getActiveDevice();
		OnCommand onCommand = new OnCommand(ce);
		Button onButton = new Button(onCommand);
		onButton.click();
		Television tv = new Television();
		SoundSystem ss = new SoundSystem();
		List<ConsumerElectronics> all = new ArrayList<ConsumerElectronics>();
		all.add(tv);
		all.add(ss);
		MuteAllCommand muteAll = new MuteAllCommand(all);
		Button muteAllButton = new Button(muteAll);
		muteAllButton.click();

	}
}
