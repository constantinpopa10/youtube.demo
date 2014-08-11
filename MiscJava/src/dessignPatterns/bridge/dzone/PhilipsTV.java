package dessignPatterns.bridge.dzone;

//Concrete Implementor 
public class PhilipsTV implements TV
{
	public void on()
	{
		System.out.println("ON on PhilipsTV");
	}
	
	
	public void off()
	{
		System.out.println("OF on PhilipsTV");
	}

	public void tuneChannel(int channel)
	{
		System.out.println("Tuning channel " + channel + " on PhilipsTV");
	}
}
