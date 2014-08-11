package dessignPatterns.template.headfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tea extends CaffeineBeverage {

	void brew(){
		System.out.println("Steeping the tea");
	}
	
	void addCondiments() throws Exception{
		System.out.println("Adding lemon");
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println(".");
		System.out.println("Your tea is ready sir. Enjoy!!!");
	}
	
	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}else{
			return false;
		}
	}
	
	private String getUserInput(){
		String answer = null;
		System.out.println("Would you like lemon in your tea(y/n)?");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			answer = in.readLine();			
		}catch(IOException ex){
			System.err.println("IO error trying to read your answer");
		}
		
		if (answer==null){
			return "no";
		}
		return answer;
	}
}
