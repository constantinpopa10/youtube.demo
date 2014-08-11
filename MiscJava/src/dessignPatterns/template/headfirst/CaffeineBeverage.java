package dessignPatterns.template.headfirst;

public abstract class CaffeineBeverage {
	final void prepareRecipe() throws Exception{
		boilWater();
		brew();
		pourInCoup();		
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	
	abstract void brew();
	abstract void addCondiments() throws Exception;
	
	void boilWater(){
		System.out.println("Boiling water");
	}
	
	void pourInCoup(){
		System.out.println("Pouring into cup");
	}
	
	boolean customerWantsCondiments(){
		return true;
	}
}
