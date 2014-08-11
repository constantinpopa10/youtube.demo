package dessignPatterns.decorator.headfirst;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public Beverage.Size getSize(){
		return beverage.getSize();
	}
	
	@Override
	public double cost() {
	    double sizeCost = 0; 
	    switch(getSize()){
	    	case SMALL: sizeCost = .10; break;
	    	case MEDIUM: sizeCost = .15; break;
	    	case LARGE: sizeCost = .20;break;
	    	default: sizeCost = 0;break;
	    }
		return sizeCost + beverage.cost();
	}

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
}
