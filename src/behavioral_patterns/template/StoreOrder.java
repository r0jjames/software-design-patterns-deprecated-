package behavioral_patterns.template;

public class StoreOrder extends OrderTemplate {

	@Override
	protected void doCheckout() {
		System.out.println("Ring items from cart");
		
	}

	@Override
	protected void doPayment() {
		System.out.println("Process payment with card present");
		
	}

	@Override
	protected void doReceipt() {
		System.out.println("Print receipt");
		
	}

	@Override
	protected void doDeliver() {
		System.out.println("Bag items at the counter");
		
	}

}
