package creational_patterns.builder.Pizza;

public class SpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		// TODO Auto-generated method stub
		this.pizza.setDough("pan baked");
		
	}

	@Override
	public void buildSauce() {
		// TODO Auto-generated method stub
		this.pizza.setSauce("hot");
		
	}

	@Override
	public void buildTopping() {
		// TODO Auto-generated method stub
		this.pizza.setTopping("pepperoni+salami");
		
	}

}
