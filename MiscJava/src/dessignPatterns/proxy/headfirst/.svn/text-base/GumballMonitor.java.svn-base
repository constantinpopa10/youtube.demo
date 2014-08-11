package dessignPatterns.proxy.headfirst;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMonitor {
	GumballMachineRemote machine;

	public GumballMonitor(GumballMachineRemote machine) {
		super();
		this.machine = machine;
	}

	public void report() {
		try {
			System.out.println("Gumball Machine: " + machine.getLocation());
			System.out.println("Current inventory: " + machine.getCount());
			System.out.println("Current state: " + machine.getState());
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String[] location = {"Iasi",
				             "Timisesti", 
				             "Dumbrava"};
		GumballMonitor[] monitor= new GumballMonitor[location.length];
		for (int i = 0; i < location.length; i++) {
			try{
				GumballMachineRemote machine  = (GumballMachineRemote)Naming.lookup(location[i]);
				monitor[i] = new GumballMonitor(machine);
				System.out.println(monitor[i]);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
		for (int i = 0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
