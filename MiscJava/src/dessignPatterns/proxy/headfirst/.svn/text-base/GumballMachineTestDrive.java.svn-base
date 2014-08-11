package dessignPatterns.proxy.headfirst;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {
	public static void main(String[] args) throws RemoteException {
		
		
		GumballMachineRemote gumballMachineIasi = new GumballMachine("Iasi", 5);
		GumballMachineRemote gumballMachineTimisesti = new GumballMachine("Timisesti", 10);
		GumballMachineRemote gumballMachineDumbrava = new GumballMachine("Dumbrava", 100);
		
		try {
			Naming.rebind("Iasi", gumballMachineIasi);
			Naming.rebind("Timisesti", gumballMachineTimisesti);
			Naming.rebind("Dumbrava", gumballMachineDumbrava);
		} catch (MalformedURLException e) {	
			e.printStackTrace();
		}
		GumballMonitor monitor  = new GumballMonitor(gumballMachineIasi);
		System.out.println(gumballMachineIasi);
		
		((GumballMachine)gumballMachineIasi).insertQuarter();
		
		((GumballMachine)gumballMachineIasi).turnCrank();
		
		System.out.println(((GumballMachine)gumballMachineIasi));
		
		((GumballMachine)gumballMachineIasi).insertQuarter();
		((GumballMachine)gumballMachineIasi).turnCrank();
		((GumballMachine)gumballMachineIasi).insertQuarter();
		((GumballMachine)gumballMachineIasi).turnCrank();
		
		((GumballMachine)gumballMachineIasi).insertQuarter();
		((GumballMachine)gumballMachineIasi).turnCrank();
		((GumballMachine)gumballMachineIasi).insertQuarter();
		((GumballMachine)gumballMachineIasi).turnCrank();
	
		((GumballMachine)gumballMachineIasi).refill(10);
		
		((GumballMachine)gumballMachineIasi).insertQuarter();
		((GumballMachine)gumballMachineIasi).turnCrank();
		((GumballMachine)gumballMachineIasi).insertQuarter();
		((GumballMachine)gumballMachineIasi).turnCrank();
		
		((GumballMachine)gumballMachineIasi).insertQuarter();
		((GumballMachine)gumballMachineIasi).turnCrank();
		((GumballMachine)gumballMachineIasi).insertQuarter();
		((GumballMachine)gumballMachineIasi).turnCrank();
	
		((GumballMachine)gumballMachineIasi).insertQuarter();
		

	    
	    System.out.println(gumballMachineIasi);
	    System.out.println(gumballMachineTimisesti);
	    System.out.println(gumballMachineDumbrava);
	}
}
