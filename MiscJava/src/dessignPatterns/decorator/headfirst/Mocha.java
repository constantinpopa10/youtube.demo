package dessignPatterns.decorator.headfirst;

public class Mocha extends CondimentDecorator {

	public Beverage beverage;
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	public Beverage.Size getSize(){
		return beverage.getSize();
	}
	
	@Override
	public double cost() {
	    double sizeCost = 0; 
	    switch(getSize()){
	    	case SMALL: sizeCost = .15; break;
	    	case MEDIUM: sizeCost = .20; break;
	    	case LARGE: sizeCost = .25;break;
	    	default: sizeCost = 0;break;
	    }
		return sizeCost + beverage.cost();
	}

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
}
