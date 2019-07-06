package builder.Pizza;

public class PizzaBuilderDemo {
	
	public static void main(String[] args) {
		
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyBuilder = new SpicyPizzaBuilder();
		
		waiter.setPizzaBuilder(hawaiianBuilder);
		waiter.constructPizza();
		
		Pizza pizza = waiter.getPizza();
		System.out.println(pizza.getDough());
		System.out.println(pizza.getSauce());
		System.out.println(pizza.getTopping());
	}

}
