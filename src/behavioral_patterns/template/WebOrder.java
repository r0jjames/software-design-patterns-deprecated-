package behavioral_patterns.template;

public class WebOrder extends OrderTemplate {

	@Override
	protected void doCheckout() {
		System.out.println("Get items from cart");
		System.out.println("Set gift preferences");
		System.out.println("Set delivery address");
		System.out.println("Set billing address");
		
	}

	@Override
	protected void doPayment() {
		System.out.println("Process payment without card present");
		
	}

	@Override
	protected void doReceipt() {
		System.out.println("Email receipt");
		
	}

	@Override
	protected void doDeliver() {
		System.out.println("Ship item to the address");
		
	}

}
