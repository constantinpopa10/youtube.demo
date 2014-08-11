package examLab.exam3;

import java.io.IOException;

public class Nonc extends UDI{
	public void buildNow() throws IllegalThreadStateException{}
	
}

abstract class UDI2 {
	public abstract void buildNow() throws IOException, ClassNotFoundException;
}

abstract class UDI extends UDI2 {
	public abstract void buildNow() throws IllegalThreadStateException, ClassNotFoundException;
}
