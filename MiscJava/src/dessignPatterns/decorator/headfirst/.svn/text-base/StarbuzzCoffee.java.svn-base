package dessignPatterns.decorator.headfirst;

import dessignPatterns.decorator.headfirst.Beverage.Size;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage expresso  = new Expresso();
		System.out.println(expresso.getDescription() + " $"+expresso.cost());
		
		Beverage darkroast = new DarkRoast();
		darkroast.setSize(Size.MEDIUM);
		darkroast = new Mocha(darkroast);
		darkroast = new Mocha(darkroast);
		darkroast = new Whip(darkroast);
		System.out.println(darkroast.getDescription() + " $"+darkroast.cost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend.setSize(Size.SMALL);
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
		
	}
}
