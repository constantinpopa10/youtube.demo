package dessignPatterns.decorator.headfirst;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public Beverage.Size getSize(){
		return beverage.getSize();
	}
	
	@Override
	public double cost() {
	    double sizeCost = 0; 
	    switch(getSize()){
	    	case SMALL: sizeCost = .40; break;
	    	case MEDIUM: sizeCost = .45; break;
	    	case LARGE: sizeCost = .50;break;
	    	default: sizeCost = 0;break;
	    }
		return sizeCost + beverage.cost();
	}

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
}
