package dessignPatterns.state.headfirst;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	

	public NoQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println();
		System.out.println("You inserted a quarter!");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserter a quarter!");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter!");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first!");
	}

}
