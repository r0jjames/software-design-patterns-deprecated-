package builder.Pizza;

abstract class PizzaBuilder {
	
	Pizza pizza;
	public Pizza getPizza() {
		return this.pizza;
	}
	
	public void createNewPizza() {
		this.pizza = new Pizza();
	}
	
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
	
	
	

}
