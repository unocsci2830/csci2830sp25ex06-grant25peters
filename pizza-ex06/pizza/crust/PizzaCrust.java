package pizza.crust;

import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem{
	protected String ingredient;
	protected Boolean isDeepDish = false;
	
	public PizzaCrust() {
		this.ingredient = "";
	}
	
	@Override
	public abstract String toString(); 

	public String toNiceString() {
		return "Crust: " + this.toString() + "(" + this.ingredient + ") $" + this.getPrice();
	}
	
	public String getIngredient() {
		return this.ingredient;
	}
	
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String checkIntegrity() {
		return "";
	}

	public void setIsDeepDish(Boolean isDeepDish) {
		this.isDeepDish = isDeepDish;
	}

    @Override
    public Double getPrice() {
        return 2.00;
    }
}
