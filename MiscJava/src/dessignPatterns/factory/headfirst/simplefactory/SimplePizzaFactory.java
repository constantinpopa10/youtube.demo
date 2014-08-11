package dessignPatterns.factory.headfirst.simplefactory;

public class SimplePizzaFactory {
	private Pizza pizza;
	public Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		}else if (type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}else if (type.equals("clam")){
			pizza = new ClamPizza();
		}else if (type.equals("veggie")){
			pizza = new VeggiePizza();
		}
		return pizza;
	}
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
}
