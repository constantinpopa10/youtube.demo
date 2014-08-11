package dessignPatterns.factory.headfirst.abstractfactory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;
//	ArrayList toppings = new ArrayList();
 
	abstract void prepare() ;

  
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
  
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
//		for (int i = 0; i < toppings.size(); i++) {
//			display.append((String )toppings.get(i) + "\n");
//		}
		return display.toString();
	}


	public Dough getDough() {
		return dough;
	}


	public void setDough(Dough dough) {
		this.dough = dough;
	}


	public Sauce getSauce() {
		return sauce;
	}


	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}


	public Veggies[] getVeggies() {
		return veggies;
	}


	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}


	public Cheese getCheese() {
		return cheese;
	}


	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}


	public Pepperoni getPepperoni() {
		return pepperoni;
	}


	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}


	public Clams getClams() {
		return clams;
	}


	public void setClams(Clams clams) {
		this.clams = clams;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}

 
 
