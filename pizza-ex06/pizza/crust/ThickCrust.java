package pizza.crust;

public class ThickCrust extends PizzaCrust {
	
	@Override
	public String toString() {
		return "Thick Crust";
	}
	
	@Override
	public String toNiceString() {
		return super.toNiceString() + (this.isDeepDish? "(Deep Dish)" : "");
	}

	
	public Boolean getIsDeepDish() {
		return this.isDeepDish;
	}

	
	@Override
	public String checkIntegrity() {
		return this.ingredient.equalsIgnoreCase("Cauliflower")? 
					"Handle carefully: crust might fall apart" : 
					super.checkIntegrity();
	}

    @Override
    public Double getPrice() {
        return 3.00;
    }
}
