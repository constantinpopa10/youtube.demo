package scjp.chapter9;

public class Account {
	private int balance = 50;
	public int getBalance(){
		return balance;
	}
	
	public void widthdraw(int amount){
		balance = balance - amount;
	}
}
