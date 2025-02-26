package pizza.topping;

public class AsiagoTopping extends CheeseTopping {
	@Override
	public String toString() {
		return "Asiago Topping";
	}

    @Override
    public Double getPrice() {
        return 2.75;
    }
}
