package dessignPatterns.proxy.headfirst;

import java.util.Random;

public class HasQuarterState implements State {
	transient GumballMachine gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis());
	

	public HasQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter!");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned!");
		gumballMachine.setState(gumballMachine.getNoQuarterState());

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned the crank...");
		int winner = randomWinner.nextInt(10);
		//System.out.println("The generated number is: " + winner);
		if((winner == 0 ) && (gumballMachine.getCount() > 1)){
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else{
			gumballMachine.setState(gumballMachine.getSoldState());
		}

	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed!!!");

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Has quarter state";
	}
	
	

}
