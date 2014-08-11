package dessignPatterns.state.headfirst;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	
	int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState  = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		if(numberGumballs>0){
			state = noQuarterState;
		}
	}

	
	public State getWinnerState() {
		return winnerState;
	}


	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}


	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}

	public int getCount() {
		return count;
	}
	
	
	
	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense(); //just an internal action; a user can't ask the macine to dispense directly.
	}
	
	public void refill(int count){
		System.out.println("You refilled the gumball machine with " + count + " gumballs");
		this.count = + count;
		state = noQuarterState;
	}
	public void releaseBall(){ //helper method
		System.out.println("A gumball comes rolling out the slot...");
		if(count !=0 ){
			count = count - 1;
		}
	}


	@Override
	public String toString() {
		return "JAVA ENABLED Gumball Machine, with " + count + " gumballs left; in state " + state.getClass().getSimpleName().toString();
	}
	
	
}
