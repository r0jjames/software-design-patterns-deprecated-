package creational_patterns.builder.Pizza;

public class Waiter {
	
	PizzaBuilder builder;
	public void setPizzaBuilder(PizzaBuilder builder) {
		this.builder = builder;
	}
	
	public Pizza getPizza() {
		return builder.getPizza();
	}
	
	public void constructPizza() {
		this.builder.createNewPizza();
		this.builder.buildDough();
		this.builder.buildSauce();
		this.builder.buildTopping();
	}

}
