package dessignPatterns.proxy.headfirst;

public class SoldOutState implements State {
	transient GumballMachine gumballMachine;	

	public SoldOutState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Sorry, no gumballs left");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, no gumballs left");

	}

	@Override
	public void turnCrank() {
		System.out.println("Sorry, no gumballs left");

	}

	@Override
	public void dispense() {
		System.out.println("Sorry, no gumballs left");

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sould out state - no gumballs left";
	}

}
