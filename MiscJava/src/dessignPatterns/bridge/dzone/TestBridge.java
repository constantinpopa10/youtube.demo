package dessignPatterns.bridge.dzone;

public class TestBridge {
	public static void main(String[] args) {
		RemoteControl rc = new ConcreteRemote();
		TV tv = new SonyTV();
		rc.setImplementor(tv);
		tv.tuneChannel(3);
		tv.on();
		tv.off();
		
//		PhilipsTVConcreteRemote remote = new PhilipsTVConcreteRemote();
//		remote.on();
//		remote.off()
//		remote.tuneChannel(3);
	}
}
