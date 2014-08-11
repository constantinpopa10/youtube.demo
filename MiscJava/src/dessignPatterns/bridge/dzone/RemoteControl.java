package dessignPatterns.bridge.dzone;

//Abstraction
public abstract class RemoteControl
{
 private TV implementor; 
 
 
 public void on()
 {
    implementor.on();
 }
 public void off()
 {
    implementor.off();
 }
 
 public void setChannel(int channel)
 {
	   implementor.tuneChannel(channel);
 }
public TV getImplementor() {
	return implementor;
}
public void setImplementor(TV implementor) {
	this.implementor = implementor;
}
 
 
}

