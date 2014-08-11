package dessignPatterns.bridge.dzone;

//Concrete Implementor 
public class SonyTV implements TV
{
	public void on()
	{
		System.out.println("ON on SonyTV");
	}
	
	
	public void off()
	{
		System.out.println("OF on SonyTV");
	}

	public void tuneChannel(int channel)
	{
		System.out.println("Tuning channel " + channel + " on SonyTV");
	}
}


