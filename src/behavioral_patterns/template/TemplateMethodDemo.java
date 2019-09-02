package behavioral_patterns.template;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		OrderTemplate webOrder = new WebOrder();
		webOrder.processOrder();
		
		OrderTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
	}

}
