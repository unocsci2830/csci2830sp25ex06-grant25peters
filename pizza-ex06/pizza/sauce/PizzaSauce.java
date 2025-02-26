package pizza.sauce;

import pizza.MenuItem;

public abstract class PizzaSauce implements MenuItem{
	@Override
	public abstract String toString(); 
	
	public String toNiceString() {
		return "Sauce: " + this.toString() + " $" +this.getPrice();
	}
	
    @Override
    public Double getPrice() {
        return 0.25;
    }

}
