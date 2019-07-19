package creational_patterns.builder.Pizza;

public class HawaiianPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		// TODO Auto-generated method stub
		this.pizza.setDough("cross");
		
	}

	@Override
	public void buildSauce() {
		// TODO Auto-generated method stub
		this.pizza.setSauce("mild");
		
	}

	@Override
	public void buildTopping() {
		// TODO Auto-generated method stub
		this.pizza.setTopping("hame + pineapple");
		
	}

}
